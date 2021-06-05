import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public MobilePhone() {
        this.contactList = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (!contactList.contains(contact.getName())) {
            contactList.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public int searchContact(Contact contact) {
        return contactList.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int pos = searchContact(oldContact);
        if (pos >= 0) {
            contactList.set(pos, newContact);
            return true;
        }
        return false;
    }

    public static void removeContact(String name) {
    }

    public static void main(String[] args) {

    }
}
