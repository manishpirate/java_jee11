package demo.condtionalStatements;

public class Switches {

    public static void main(String[] args) {
        int colorRainbow = 10;
        final int red = 5;
        VAL:
        switch (colorRainbow){
            default:
                System.out.println("Default is first element and called");
            case red :
                System.out.println("Final can be used inside of switch");
                break VAL;
            case 3:
            case 4:
                System.out.println("This is a combined case");

        }
        System.out.println("Lets hope i get called");


    }
}
