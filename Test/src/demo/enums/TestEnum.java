package demo.enums;

enum Planet {
    MERCURY(0.39), VENUS(), EARTH;
     double distanceFromSunAU = 1.0;
    private Planet(double distance){
        distanceFromSunAU = distance;
    }
    private Planet(){
        System.out.println("i am being called");
        distanceFromSunAU = 5.0;
    }
    public double getDistace(){
        return distanceFromSunAU;
    }


}

public class TestEnum {
    public static void main(String[] args) {
        for(Planet p : Planet.values()){
            System.out.println(p.getDistace());
        }
    }
}

