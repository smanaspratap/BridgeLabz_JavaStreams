import java.util.*;
import java.util.Scanner;
public class AddressBook {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact person){
        contacts.add(person);
        System.out.println("Contact Added Successfully");
    }
}


class AddressBookMain {

    public static void main(String[] args){

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        AddressBook book = new AddressBook();

        System.out.println("Enter First Name");
        String first = sc.next();

        System.out.println("Enter Last Name");
        String last = sc.next();

        System.out.println("Enter Address");
        String address = sc.next();

        System.out.println("Enter City");
        String city = sc.next();

        System.out.println("Enter State");
        String state = sc.next();

        System.out.println("Enter Zip");
        String zip = sc.next();

        System.out.println("Enter Phone");
        String phone = sc.next();

        System.out.println("Enter Email");
        String email = sc.next();

        Contact person = new Contact(first,last,address,city,state,zip,phone,email);

        book.addContact(person);
    }
}