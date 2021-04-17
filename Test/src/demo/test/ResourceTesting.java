package demo.test;

class TestOne {
    private String name;
    private final String module;

    public String getName() {
        return name;
    }

    public String getModule() {
        return module;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestOne(String name,String module){
        this.name = name;
        this.module = module;
    }
}
public class ResourceTesting {

    public static void main(String args[]){
       TestOne t1 = new TestOne("manish","Java");
       System.out.println(t1.getName() + t1.getModule());

    }
}
