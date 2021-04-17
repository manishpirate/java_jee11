package demo.Inheritence;

public class CastingExample {

    public static void main(String[] args) {
        Product p1 = new Food(1, 23.34f,"Maggi",100.0f);
        Product p2 = new Drink(2, 22.12F, "Bloddy Mary", 350.0F, 2) ;

        //Checking what all we can get from p1
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        //System.out.println(p1.getweight()); Not accessible

        //we can cast to parent easily
        Product p3 = (Product)p2;
        //casting among siblings
        Food f3 = new Food(3, 56.9F, "pasta", 300F);
        p3 = f3;
        Drink d1 = new Drink(4,25F, "Juice", 300F, 1);
        d1 = (Drink)p3;

    }
}

//This is the parent class which is for demo
class Product {
    private int id;
    private float price;
    private String name;

    public Product(int id, float price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Food extends Product {
    private float weight;

    public Food(int id, float price, String name, float weight) {
        super(id, price, name);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

class Drink extends Product {
    private float quantity;
    private int noOfStraws;

    public Drink(int id, float price, String name, float quantity,int noOfStraws) {
        super(id, price, name);
        this.quantity=quantity;
        this.noOfStraws = noOfStraws;
    }

    public int getNoOfStraws() {
        return noOfStraws;
    }

    public void setNoOfStraws(int noOfStraws) {
        this.noOfStraws = noOfStraws;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}