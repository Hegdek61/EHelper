package uk.ac.tees.aad.B1212361;

public class Contact {

    String name;
    String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Contact(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public Contact() {
    }
}
