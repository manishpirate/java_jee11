package demo.Stream.Base.collector;

import java.time.LocalDate;

public class Product {

    private String productName;
    private double productPrice;
    private LocalDate bestBeforeDate;

    public Product(String productName, double productPrice, LocalDate bestBeforeDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", bestBeforeDate=" + bestBeforeDate +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(LocalDate bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }
}
