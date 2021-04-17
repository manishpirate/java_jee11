package demo.test;

class Product {
    private String productName;
    private String productPrice;
    private String productCategory;
    public static String bestBefore;

    static {
        bestBefore = "3";
    }

    public static String getBestBefore() {
        return bestBefore;
    }

    public static void setBestBefore(String bestBefore) {
        Product.bestBefore = bestBefore;
    }

    public Product(String productName, String productPrice, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        System.out.println(Product.bestBefore);
    }
}

class TestTwo {
    public static final int MAX_VALUE;

    static {
        MAX_VALUE = 4;
    }



}

public class StaticTest {

    public static void main(String[] args) {
        Product p1 = new Product("Tea","23.56","Eatable");
        Product p2 = new Product("Burger","20","Fast Food");

        p1.setProductCategory("Drink");
        p1.getBestBefore();
        p1.getBestBefore();
        Product.getBestBefore();
        System.out.println(TestTwo.MAX_VALUE);
    }
}
