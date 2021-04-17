import demo.test.Test;

import java.util.Arrays;
import java.util.List;

class Client {

}

public class TestStaticNew {





    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder();
       sb.append("Howdy");
       sb.insert(0,' ');
       sb.replace(3,5,"LL");
       sb.insert(6, "cow");
       sb.delete(2,7);
        System.out.println(sb.length());


    }
}
