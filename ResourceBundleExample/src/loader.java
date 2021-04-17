import java.util.Locale;
import java.util.ResourceBundle;

public class loader {

    public static void main(String args[]){
        Locale en = Locale.ENGLISH;
        ResourceBundle rs = ResourceBundle.getBundle("resources.messages", en);
        System.out.println(rs.getString("order"));
    }
}
