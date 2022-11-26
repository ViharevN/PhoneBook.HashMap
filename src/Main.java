import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(new FullName("Иванов", "Иван"),"89123456789");
        phoneBook.addContact(new FullName("Петров", "Петр"),"89123456788");
        phoneBook.addContact(new FullName("Васильев", "Василий"),"89123456787");
        phoneBook.addContact(new FullName("Сидоров", "Сидор"),"89123456786");
        phoneBook.addContact(new FullName("Евгеньев", "Евгений"),"89123456785");
        phoneBook.addContact(new FullName("Алексеев", "Иван"),"89123456784");
        phoneBook.addContact(new FullName("Сергеев", "Иван"),"89123456783");
        phoneBook.addContact(new FullName("Потапов", "Иван"),"89123456782");
        phoneBook.addContact(new FullName("Синев", "Иван"),"89123456671");
        phoneBook.addContact(new FullName("Синяков", "Иван"),"89123456451");
        phoneBook.addContact(new FullName("Тарабаркин", "Иван"),"89123456790");
        phoneBook.addContact(new FullName("Табаков", "Иван"),"89123456789");
        phoneBook.addContact(new FullName("Пятаков", "Иван"),"89123456778");
        phoneBook.addContact(new FullName("Кубов", "Иван"),"89123456767");
        phoneBook.addContact(new FullName("Квадратов", "Иван"),"89123456756");
        phoneBook.addContact(new FullName("Треуголов", "Иван"),"89123456745");
        phoneBook.addContact(new FullName("Кругов", "Иван"),"89123456734");
        phoneBook.addContact(new FullName("Круглов", "Иван"),"89123456713");
        phoneBook.addContact(new FullName("Цветков", "Иван"),"89123456712");


        for (Map.Entry<FullName, String> contact : phoneBook.getContacts()) {
            System.out.printf("%s - %s%n", contact.getValue(), contact.getKey());
        }


    }
}