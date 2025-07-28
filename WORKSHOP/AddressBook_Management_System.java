import java.util.*;

class Contact {
    String name;
    String phone;
    String email;
    String address;

    Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    public String toString() {
        return name + " | " + phone + " | " + email + " | " + address;
    }
}

class AddressBook<K, V extends Contact> {
    Map<String, V> map;

    AddressBook() {
        map = new HashMap<>();
    }

    public void addContact(K key, V val) {
        map.put(key.toString(), val);
    }

    public void removeContact(K key) {
        map.remove(key.toString());
    }

    public Contact searchByName(K key) {
        return map.get(key.toString());
    }

    public void listContacts() {
        for (Map.Entry<String, V> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    
    public boolean hasSameAdd(Contact v1, Contact v2) {
        return v1.getAddress().equalsIgnoreCase(v2.getAddress());
    }

    public void sortByName() {
        List<Contact> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparing(Contact::getName));
        list.forEach(System.out::println);
    }
    
    public void sortByPhone() {
        List<Contact> list=new ArrayList<>(map.values());
    	list.sort(Comparator.comparing(Contact::getPhone));
    	list.forEach(System.out::println);
    }

}

public class AddressBook_Management_System {
    public static void main(String [] args){
        AddressBook<String,Contact> ab=new AddressBook();
        Contact c1=new Contact("Alice","8077332988","alice.gmail.com","GLA University");
        Contact c2=new Contact("Bob","8011323988","bob.gmail.com","AGRA");
    	Contact c3=new Contact("Devika","8077332345","abc.gmail.com","ABC University");
    	
    	ab.addContact(c1.getName(), c1);
    	ab.addContact(c2.getName(), c2);
    	ab.addContact(c3.getName(), c3);
    	
    	ab.listContacts();
    	
    	System.out.println("After removal :");
    	ab.removeContact(c1.getName());
    	ab.listContacts();
    	
    	System.out.println();
    	ab.sortByName();
    	System.out.println(ab.hasSameAdd(c2,c3));
    }
}