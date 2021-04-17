package demo.Serilaizable;

import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String country;

    public Address(String state, String country) {
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
