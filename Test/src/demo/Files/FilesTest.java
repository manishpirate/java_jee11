package demo.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;
import java.util.Set;

public class FilesTest {

    public static void main(String[] args) throws IOException {
        Path p1 = Path.of("/","Users","manishsharma", "code","myFiles","Others");
        //Files.createDirectory(p1);
        Path p2 = p1.resolve("./abcd.txt").normalize();
        System.out.println("p2 = " + p2);
        //Files.createFile(p2);
        System.out.println(Files.isRegularFile(p2));
        System.out.println(Files.isReadable(p2));
        //Files.writeString(p2,"This is a file content");
        Files.lines(p2).forEach(System.out::println);
        PosixFileAttributes fileAttributes = Files.readAttributes(p2, PosixFileAttributes.class);
        UserPrincipal principal = fileAttributes.owner();
        System.out.println(principal.getName());
        GroupPrincipal groupPrincipal = fileAttributes.group();
        System.out.println(groupPrincipal.getName());
        Set<PosixFilePermission> filePermissionsSet = fileAttributes.permissions();

        filePermissionsSet.stream().forEach(p -> System.out.println(p.toString()));
        System.out.println(fileAttributes.size());
        System.out.println(fileAttributes.lastAccessTime());

    }
}
