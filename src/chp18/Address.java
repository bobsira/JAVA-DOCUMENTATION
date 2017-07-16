package chp18;

/**
 * Created by bobsira on 7/16/17.
 * A simple mailing list example
 */
public class Address {
    private String name, street, city, state, code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}
