package by.it_academy.practice.homework10;

import java.util.HashMap;
import java.util.Map;

public class Homework10 {
    private static Map<String, Integer> usersMap = new HashMap<>();

    public static void main(String[] args) {
        reserveKeyAndValuePositions(addHashMap());
        PhoneBook phoneBook = new PhoneBook();
        addUsers(phoneBook);
    }

    public static void addUsers(PhoneBook phoneBook) {
        phoneBook.addNumbers("Usenkov", "+375291112234");
        phoneBook.addNumbers("Lysenkov", "+375291112334");
        phoneBook.addNumbers("Usenkov", "+375299998877");
        phoneBook.addNumbers("Martynov", "80293456688");
        System.out.println(phoneBook);
    }

    public static Map<String, Integer> addHashMap() {
        usersMap.put("Username_1", 1);
        usersMap.put("Username_2", 2);
        usersMap.put("Username_3", 3);
        return usersMap;
    }

    public static void reserveKeyAndValuePositions(Map<String, Integer> hashMap) {
        Map<Integer, String> hashMap2 = new HashMap<>();
        for (var pair : hashMap.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            hashMap2.put(value, key);
        }
        System.out.println(hashMap2);
    }
}