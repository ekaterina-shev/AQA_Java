package lesson_6.case_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> phoneDirectory = new HashMap<>();

    public void add(String lastname, String phoneNumber) {
        if (!phoneDirectory.containsKey(lastname)) {
            phoneDirectory.put(lastname, new ArrayList<>());
        }
        phoneDirectory.get(lastname).add(phoneNumber);
    }

    public List<String> get(String lastname) {
        return phoneDirectory.getOrDefault(lastname, new ArrayList<>());
    }
}
