package demo.Interfaces;

interface Black {
    default void printColor(){
        System.out.println("Black");
    }
}

interface Red  {
    default void printColor(){
        System.out.println("Red");
    }
}

interface Gold {
    static void printColor(){
        System.out.println("Gold");
    }
}


public class TestLoad implements Black, Red, Gold {

    public void printColor(){
       Red.super.printColor();
       Black.super.printColor();
    }

    public static void main(String[] args) {
        TestLoad load = new TestLoad();
        load.printColor();
        Gold.printColor();

    }
}
