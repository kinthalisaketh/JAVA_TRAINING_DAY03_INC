import java.util.ArrayList;
import java.util.Scanner;
public class SearchContacts {
    public static class Contact {
        private String name;
        private String phoneNumber;
        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
        public String getName() {
            return name;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String toString() {
            return "Name: " + name + ", Phone Number: " + phoneNumber;
        }
    }
    public static class PhoneBook {
        private ArrayList<Contact> contacts;
        public PhoneBook() {
            contacts = new ArrayList<>();
        }
        public void addContact(Contact contact) {
            contacts.add(contact);
        }
        public Contact[] searchContactsByName(String name) {
            ArrayList<Contact> result = new ArrayList<>();

            for (Contact contact : contacts) {
                if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                    result.add(contact);
                }
            }
            return result.toArray(new Contact[0]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Alice Johnson", "7584934602"));
        phoneBook.addContact(new Contact("Bob Smith", "1234456789"));
        phoneBook.addContact(new Contact("Charlie Brown", "0987654322"));
        phoneBook.addContact(new Contact("Alison Davis", "5678901234"));
        System.out.println("Enter the name (or part of it) to search for:");
        String searchString = scanner.nextLine().trim();
        Contact[] results = phoneBook.searchContactsByName(searchString);
        if (results.length > 0) {
            System.out.println("Search results:");
            for (Contact contact : results) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts found matching the search string.");
        }
        
        scanner.close();
    }
}
