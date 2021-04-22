package demo.Files;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("/Users/manishsharma/testpath/Child1");
        Path p2 = Path.of("./Child2");
        Path p3 = p1.resolveSibling(p2);
        System.out.println(p3);
        System.out.println(p3.normalize());
        System.out.println(p3.relativize(p1));
        //System.out.println(p1.getName(2));

        //Files.walk(p1).forEach(p -> System.out.println(p.getFileName()));


    }
}