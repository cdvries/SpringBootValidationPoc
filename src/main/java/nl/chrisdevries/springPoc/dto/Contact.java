package nl.chrisdevries.springPoc.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Person.class, name = "person"),

        @JsonSubTypes.Type(value = Company.class, name = "company")}
)
public abstract class Contact {

    @Valid
    private List<ContactInfo> contactInfo = new ArrayList<>();

    public List<ContactInfo> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(List<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }

}
