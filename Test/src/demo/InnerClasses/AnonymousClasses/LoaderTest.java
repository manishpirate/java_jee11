package demo.InnerClasses.AnonymousClasses;

import java.math.BigDecimal;

public class LoaderTest {

    public static void main(String[] args) {
        Order order = new Order (){
            @Override
            public BigDecimal getDiscount() {
                return BigDecimal.ONE;
            }
        };
        System.out.println(order.getDiscount());
    }

}
