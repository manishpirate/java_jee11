package demo.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/manishsharma/docs/others");
        Files.createDirectory(path);
    }
}
