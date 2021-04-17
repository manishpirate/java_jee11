package demo.Inheritence;

public class ConstructorForParentClass {

    public static void main(String[] args) {
        Parent p1 = new Child("Nitin", "36");
        System.out.println(p1.getName());
    }

}

 abstract class Parent {
    private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Parent(String name) {
        System.out.println("I am called : Parent Constructor");
        this.name=name;
    }

    public abstract void display();
}

class Child extends Parent {

    private String age;

    public Child(String name, String age) {
        super(name);
        System.out.println("I am called : child constructor");
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("I will implement the method");
    }
}


