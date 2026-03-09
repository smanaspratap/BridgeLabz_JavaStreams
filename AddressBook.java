import java.util.*;
import java.util.Scanner;
public class AddressBook {
    //UC 5 is handeled using the below code line..
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact person){
        contacts.add(person);
        System.out.println("Contact Added Successfully");
    }
    Map<String,AddressBook> addressBooks = new HashMap<>();

    public void createAddressBook(String name){
        addressBooks.put(name,new AddressBook());
    }

    public void editContact(String name, Scanner sc){

        for(Contact c : contacts){

            if(c.firstName.equalsIgnoreCase(name)){

                System.out.println("Enter new city");
                c.city = sc.next();

                System.out.println("Enter new phone");
                c.phone = sc.next();

                System.out.println("Contact Updated");
                return;
            }
        }

        System.out.println("Contact Not Found");
    }
    public void deleteContact(String name){

        contacts.removeIf(c -> c.firstName.equalsIgnoreCase(name));

        System.out.println("Contact Deleted");
    }
    public boolean isDuplicate(Contact person){

        return contacts.stream()
                .anyMatch(c -> c.firstName.equalsIgnoreCase(person.firstName)
                        && c.lastName.equalsIgnoreCase(person.lastName));
    }
    public void searchByCity(String city){

        contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .forEach(System.out::println);
    }

    public void searchByState(String state){

        contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .forEach(System.out::println);
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