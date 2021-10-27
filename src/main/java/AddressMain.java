import java.util.ArrayList;
import java.util.Scanner;


public class AddressMain {

    ArrayList<ContactDetails> addressBook= new ArrayList<>();
    //main function
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");

    }

    //add function to add details
    public void addContact(String name,String surname,String email,String address,String phone,String zip,String state,String city){
        addressBook.add(new ContactDetails(name, surname, address, email, city, zip, state, phone));
    }

    //return how much data is enter
    public int count(){
        return addressBook.size();

    }





}
