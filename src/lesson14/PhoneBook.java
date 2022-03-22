package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    public HashMap<String, List<String>> phoneBook = new HashMap<>();

    public void addContact(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            List<String> phones = phoneBook.get(name);
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
            phoneBook.put(name, phones);
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name, phones);

        }
    }

    public void printAllContacts(){
        for (String contact:phoneBook.keySet()){
            System.out.println(contact + ": " + phoneBook.get(contact));
        }
    }



}
