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


    public void printAllContacts() {
        for (String contact : phoneBook.keySet()) {
            System.out.println(contact + ": " + phoneBook.get(contact));
        }
    }

    public void printAllContactsNumbers(String name) {
        if (phoneBook.containsKey(name)) {
            for (String contact : phoneBook.keySet()) {
                System.out.println(name + ": " + phoneBook.get(name));
                return;
            }
        } else {
            System.out.println("Нет такого контакта");
        }
    }

    public void howManyNumbersContact(String name) {

        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name).size());

        } else {
            System.out.println("Нет такого контакта");
        }


    }

    public void howManyNumbersAll() {
        int count = 0;
        for (String name : phoneBook.keySet()) {
            count += phoneBook.get(name).size();
        }
        System.out.println(count);

    }


}
