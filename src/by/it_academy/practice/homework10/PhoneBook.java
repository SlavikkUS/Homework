package by.it_academy.practice.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> numbersPhone;

    public PhoneBook(Map<String, List<String>> numbersPhone) {
        this.numbersPhone = numbersPhone;
    }

    public Object addNumbers(String key, String value, Map<String, List<String>> numbersPhone) {
        if (numbersPhone.containsKey(key)) {
            return numbersPhone.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            return numbersPhone.put(key, list);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhoneBook{");
        sb.append("numbersPhone=").append(numbersPhone);
        sb.append('}');
        return sb.toString();
    }
}