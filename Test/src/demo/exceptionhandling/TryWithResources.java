package demo.exceptionhandling;

import java.io.*;

public class TryWithResources {

    public static void main(String[] args)   {
        try (BufferedReader bf = new BufferedReader(new FileReader("hello.txt"));) {
            return;
        } catch(FileNotFoundException fexception){
            System.out.println("I caught file exception");
        }catch(IOException ioException){
            System.out.println("I caught file IO exception");
        }
        System.out.println("I am called");
    }
}
