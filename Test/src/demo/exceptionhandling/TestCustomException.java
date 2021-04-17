package demo.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestCustomException {

    public static void readFile() throws CustomException {
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String str = br.readLine();
            System.out.println("str = " + str);
        } catch (FileNotFoundException e) {
            System.out.println("Catch 1 called");
            return;
        } catch (IOException e) {
            System.out.println("Catch 2 called");
        }finally {
            System.out.println("Finally block called");
        }
    }

    public static void main(String[] args) throws CustomException {
        try {
            readFile();
            System.out.println("I am back flow");
        }catch(CustomException exc){
            System.out.println(exc.getMessage());
        }
    }

}
