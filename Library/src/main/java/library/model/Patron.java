package library.model;

/**
 * Created by berloc on 2016.12.17..
 */
public class Patron {


    private String name;
    private int patronID;
    private String address;
    private int phoneNumber;
    private String type;

    public Patron() {
    }

    public Patron(String name, int patronID, String address, int phoneNumber, String type) {
        this.name = name;
        this.patronID = patronID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatronID() {
        return patronID;
    }

    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
