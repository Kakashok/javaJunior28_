package lesson14;

public class Main2 {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.addContact("Вася", "+79878978954");
        book.addContact("Вася", "+78989085254");
        book.addContact("Вася", "+79573897236");
        book.addContact("Петя", "+79878978976");
        book.addContact("Петя", "+79878978978");
        book.addContact("Петя", "+79573897236");

        book.printAllContacts();


        // вернуть сколько у контакта номеров телефона
        book.howManyNumbersContact("Вася");

        // напечатать все номера по такому то контакту
        book.printAllContactsNumbers("Петя");


        // напечатать сколько всего телефонных номеров в телефонной книге
        book.howManyNumbersAll();

        // *** чтобы пете нельзя добавить номер васи


    }
}
