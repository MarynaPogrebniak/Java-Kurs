package l_21_02_HashMap;

import java.util.HashMap;

public class HashMap_phonenumbers {

  public static void main(String[] args) {
    //Создайте телефонную книгу нашей группы.

    HashMap<String, String> phoneNumbers = new HashMap<>();

    phoneNumbers.put("+49015203012121", "Maryna");
    phoneNumbers.put("+49015236789531", "Leonid");
    phoneNumbers.put("+49015267890987", "Ekaterina");
    phoneNumbers.put("+49015203123211", "Viacheslav");
    phoneNumbers.put("+49015203333333", "Dina");
    phoneNumbers.put("+49015204444556", "Abu-Bakar");
    phoneNumbers.put("+49015207778655", "Oleg");

    for (String i : phoneNumbers.keySet()) {
      System.out.println("Phone number: " + i + " Name " + phoneNumbers.get(i));
    }

  }

}
