package nl.chrisdevries.springPoc.dto;

public class Company extends Contact {

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
