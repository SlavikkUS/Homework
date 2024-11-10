package by.it_academy.practice.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework10 {

    private static Map<String, Integer> usersMap = new HashMap<>();
    private static Map<String, List<String>> numbersPhone = new HashMap<>();

    public static void main(String[] args) {
        reserveKeyAndValuePositions(addHashMap());
        addUsers();
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

    public static void addUsers() {
        addNumbers("Usenkov", "+375291112234", numbersPhone);
        addNumbers("Lysenkov", "+375291112334", numbersPhone);
        addNumbers("Usenkov", "+375299998877", numbersPhone);
        addNumbers("Martynov", "80293456688", numbersPhone);
        System.out.println(numbersPhone);
    }

    public static Object addNumbers(String key, String value, Map<String, List<String>> numbersPhone) {
        if (numbersPhone.containsKey(key)) {
            return numbersPhone.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            return numbersPhone.put(key, list);
        }
    }
}
