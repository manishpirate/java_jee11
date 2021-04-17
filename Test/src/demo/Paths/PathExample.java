package demo.Paths;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class PathExample {

    public static void main(String[] args) throws IOException {
        Path p1 = Path.of("/", "Users","manishsharma", "code","abcd.txt");
        for(int i= 0; i < p1.getNameCount(); i++){
            System.out.println("Index is " + i + " Value is " + p1.getName(i));
        }
        Path p1Parent = p1.getParent();
        Path p2 = p1Parent.resolve("./myFiles/abcd.txt");//.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(p2);
        Path p3 = p2.normalize();
        System.out.println("p3 = " + p3);
        Path p4 = p1.relativize(p2);
        System.out.println("p4 = " + p4);
    }
}
