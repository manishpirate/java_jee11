package demo.oops.innerclasses;


interface Speak {
    public default int getVolume() { return 20; }
}
interface Whisper {
    public default int getVolume() { return 10; }
}
 class Debate implements Whisper, Speak {


    public int getVolume() {
        return 30; }
    public static void main(String[] a) {
        var d = new Debate();
        System.out.println(d.getVolume());
    }
}


public class StaticNested {



    private static int x=9;
    private int y=3;

    private static void dis(){
        System.out.println(x);
    }

    private void myMethod(){
        System.out.println(y);
    }

    public static class InnerClass {

        public static void dis(){
            System.out.println("I am called");
        }

        public void display(){
            System.out.println("x = " + x);
            //System.out.println("y = "+ y);Unassible
            StaticNested.dis();

        }
    }

    public static void main(String[] args) {
        StaticNested.InnerClass i1 = new StaticNested.InnerClass();
        i1.display();
    }
}

