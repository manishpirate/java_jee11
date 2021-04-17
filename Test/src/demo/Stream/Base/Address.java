package demo.Stream.Base;

public class Address {

    private String country;
    private String state;
    private String homeLane;

    public Address(String country, String state, String homeLane) {
        this.country = country;
        this.state = state;
        this.homeLane = homeLane;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHomeLane() {
        return homeLane;
    }

    public void setHomeLane(String homeLane) {
        this.homeLane = homeLane;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", homeLane='" + homeLane + '\'' +
                '}';
    }
}
