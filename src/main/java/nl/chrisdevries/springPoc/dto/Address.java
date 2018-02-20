package nl.chrisdevries.springPoc.dto;


public class Address extends ContactInfo {


    private String streetName;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


}
