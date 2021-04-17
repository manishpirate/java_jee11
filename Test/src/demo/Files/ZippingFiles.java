package demo.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZippingFiles {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("/","Users","manishsharma","code","myFiles","Others");
        Path zipPath = path.resolve("data.zip").normalize();
        //Zip file is created here
        Files.createFile(zipPath);
        Set<PosixFilePermission> permisions = PosixFilePermissions.fromString("rw-rw-r--");
        Files.setPosixFilePermissions(zipPath,permisions);
        try ( ZipOutputStream out = new ZipOutputStream(Files.newOutputStream(zipPath))){
            out.setLevel(Deflater.DEFAULT_COMPRESSION);
            Files.walk(path).filter(p -> !Files.isDirectory(p)).forEach(p -> {
                ZipEntry zipEntry = new ZipEntry(p.toString());
                try {
                    out.putNextEntry(zipEntry);
                    out.write(Files.readAllBytes(p));
                    out.close();
                }catch(Exception e){
                    System.out.println("some error occurred"+  e.getMessage());
                }
            });
        }catch(Exception e){
            System.out.println("Some error occured = " + e);
        }
    }
}
