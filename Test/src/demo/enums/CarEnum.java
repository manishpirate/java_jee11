package demo.enums;


public enum CarEnum {
    JEEP("jeep", 20), XUV("XUV500", 30), BWM("berkeley",40);

    private String name;
    private int cost;
    private static String allPartsCost = "very high";

    CarEnum(String name, int cost){
        this.name=name;
        this.cost=cost;
    }

    public void setAllPartsCost(String allPartsCost) {
        CarEnum.allPartsCost = allPartsCost;
    }

    public String getEnumName(){
        return this.name;
    }

    public static void main(String[] args) {
        CarEnum jeep = CarEnum.JEEP;
        System.out.println("jeep.getEnumName() = " + jeep.getEnumName() + jeep.allPartsCost);
        //Changing the cost of the part after
        jeep.setAllPartsCost("low");
        for(CarEnum car : CarEnum.values()){
            System.out.println( "[ car.ordinal(), name and cost] " + car.ordinal() +  car.name + car.cost);
            System.out.println("car cost = " + car.allPartsCost);
        }
        System.out.println("jeep = " + jeep.allPartsCost);
    }

}
