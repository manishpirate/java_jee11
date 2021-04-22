package demo.justlikethat;

import java.util.Arrays;

public class Loader {

    public static void main(String[] args) {
       var sb = new StringBuilder("radical");
        System.out.println(sb.substring(3));
        System.out.println("sb = " + sb);
        int x = 5____2;
        System.out.println(x);
        boolean b1 = true;
        boolean b2 = true;
        System.out.print(b1^b2);


        sb.append("hello world");
        System.out.println(sb);
        sb.append("12345678901234567890", 3, 6);
        System.out.println(sb);
        sb.subSequence(3,7);
        System.out.println("sb = " + sb);
    }
}

