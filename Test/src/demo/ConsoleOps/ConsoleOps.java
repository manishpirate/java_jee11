package demo.ConsoleOps;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleOps {

    public static void main(String[] args) {
        Console c = System.console();
        if(c==null){
            System.out.println("Console is not supported");
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter some text in console. Type exit to exit : ");
            String txt;
            while (!(txt = s.nextLine()).equals("exit")) {
                System.out.println("Echo :  " + txt);
            }
        }else {
            PrintWriter out = c.writer();
            out.println("Please enter some text in console. Type exit to exit : ");
            String txt;
            while (!(txt = c.readLine()).equals("exit")) {
                System.out.println("Echo :  " + txt);
            }
        }

    }
}
