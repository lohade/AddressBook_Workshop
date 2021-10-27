public class ContactDetails {

    public String name;
    public String surname;
    public String address;
    public String email;
    public String city;
    public String zip;
    public String state;
    public String phone;

    public ContactDetails(String name, String surname, String address, String email, String city, String zip, String state, String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phone = phone;
    }

    public String toString(){
        return ("First name: " + name + "\n Last name: " + surname + "\n Address: " + address + "\n city: " + city
                + "\n state: " +state + "\n email: " + email + "\n zip: " + zip + "\n phone number:" + phone + "");
    }
}
