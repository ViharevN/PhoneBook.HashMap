import java.util.*;

public class PhoneBook {
    private final Map<FullName, String> map = new HashMap<>();

    public void addContact(FullName fullName, String phone) {
        map.put(fullName, phone);
    }

    public Set<Map.Entry<FullName, String>> getContacts() {
        return map.entrySet();

    }



}
