package nl.chrisdevries.springPoc.dto;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class Contacts {

    @Valid
    private List<Contact> contact = new ArrayList<>();


    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }


}
