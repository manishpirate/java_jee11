package demo.condtionalStatements;

import jdk.swing.interop.SwingInterOpUtils;

public class Looper {

    private static final int ACE = 1;
    private static final int ACE_1 = 2;
    private static final int ACE_2 = 3;

    public String display(int amount){
        switch(amount) {
            case ACE:
                return "Hello";
            case ACE_1:
                return "hello_1";
        }
        return "";
    }

    public static void main(String[] args) {
        Looper l1 = new Looper();
        System.out.println(l1.display(1));
    }
}



