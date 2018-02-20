package nl.chrisdevries.springPoc;


import nl.chrisdevries.springPoc.dto.*;
import org.hibernate.validator.HibernateValidator;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.Validator;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
@Validated

public class ContactsEndPoint {


    @RequestMapping(method = RequestMethod.GET)
    public Contacts getContacts() {

        Contacts contacts = new Contacts();

        Company company = new Company();
        Address address = new Address();
        address.setStreetName("streetname");
        address.setLastUpdated(LocalDate.now());
        company.getContactInfo().add(address);
        company.setCompanyName("company1");

        Person person = new Person();
        person.setFirstName("Chris");
        person.setLastName("de Vries");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("1234");
        phoneNumber.setLastUpdated(LocalDate.now());
        person.getContactInfo().add(phoneNumber);

        contacts.getContact().add(company);
        contacts.getContact().add(person);

        return contacts;

    }


    @RequestMapping(method = RequestMethod.POST)
    public void post(@Valid @RequestBody Contacts contacts) {
        Person person = (Person) contacts.getContact().stream()//
                .filter(contact -> contact instanceof Person).findFirst().orElseThrow(IllegalArgumentException::new);

        System.out.println(person.getFirstName());
    }
}
