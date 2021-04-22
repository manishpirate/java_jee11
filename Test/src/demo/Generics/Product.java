package demo.Generics;

//This is the parent class which is for demo
public class Product {
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
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