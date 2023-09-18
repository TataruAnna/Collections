package exercitii.phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        List<String> allContacts = new ArrayList<>();
        allContacts.add("23");
        allContacts.add("34");
        allContacts.add("56");
        allContacts.add("72");
        phoneBook.setContacts(allContacts);

        List<String> blackList = new ArrayList<>();
        blackList.add("23");
        blackList.add("33");
        blackList.add("34");
        phoneBook.setBlackList(blackList);

        PhoneBook phoneBook1 = new PhoneBook(allContacts,blackList);
        System.out.println(PhoneBook.filteredContacts(allContacts,blackList));
        try {
            phoneBook.addToBlackList("78");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(phoneBook.getContacts());
        System.out.println(phoneBook.getBlackList());
    }
}
