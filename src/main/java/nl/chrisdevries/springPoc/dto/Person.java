package nl.chrisdevries.springPoc.dto;

import nl.chrisdevries.springPoc.dto.validators.ValidName;

public class Person extends Contact {

    private String firstName;

    @ValidName
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
