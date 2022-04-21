package practiceDay33StaticCustomClass;

public class AddressTask {

    public String street, city,state;
    public int zipCode;

    public static String country, planet;

    static {
        country = "USA";
        planet = "Earth";
    }

    public AddressTask(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return  street +
                "\n" + city + state +
                ", " + zipCode;
    }

    public static void main(String[] args) {
        AddressTask add1 = new AddressTask("7925 Jones Branch Dr","McLean", "Va", 22012);
        System.out.println(add1);
    }
}
