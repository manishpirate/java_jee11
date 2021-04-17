package demo.exceptionhandling;

public class DivideByZero {

    public static int divide(int a, int b){
        int z = a/b;
        return z;
    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = divide(a, b);
        System.out.println("c = " + c);
    }
}
