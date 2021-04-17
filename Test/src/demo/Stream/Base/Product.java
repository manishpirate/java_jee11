package demo.Stream.Base;

import java.time.LocalDate;

public class Product {

    private String productName;
    private int productPrice;
    private LocalDate bestBefore;

    public Product(String productName, int productPrice, LocalDate bestBefore) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.bestBefore = bestBefore;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", bestBefore=" + bestBefore +
                '}';
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }
}

