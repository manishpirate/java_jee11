package demo.condtionalStatements;

class RedChicken extends Chicken {
    public RedChicken(int eggs){
        super(eggs);
    }
}

public class Chicken {

    public static void Chicken(){
        System.out.println("hello");
    }

    private Integer eggs = 2;

    {
        this.eggs = 3;
    }

    public Chicken(int eggs) {
        this.eggs = eggs;
        Chicken();
    }

    public static void main(String[] r) {
        var c1 = new Chicken(1);
        var c2 = new Chicken(2);
        var c3 = new Chicken(3);
        c1.eggs = c2.eggs;
        c2 = c1;
        c3.eggs = null;
    }
}
