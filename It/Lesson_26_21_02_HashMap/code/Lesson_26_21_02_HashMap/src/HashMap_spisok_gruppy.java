import java.util.HashMap;

public class HashMap_spisok_gruppy {

  public static void main(String[] args) {
//Задача 1: Создать HashMap с именами и возрастом членов нашей группы.
// Распечатать список группы с возрастами.
    System.out.println("Список группы 23-2");

    HashMap<String, Integer> group23 = new HashMap();

    group23.put("Vadim", 25);
    group23.put("Leonid", 25);
    group23.put("Lilian", 40);
    group23.put("Viacheslav", 51);
    group23.put("Katerina", 33);
    group23.put("Dina", 36);
    group23.put("Katerina", 44); //печатает последний ключ и значение
    group23.put("Maryna", 33);
    group23.put("Valentin", 40);
    group23.put("Oleg", 38);
    group23.put("Evgeny", 19);
    group23.put("Yehor", 32);
 
    for (String i : group23.keySet()) {

      System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));
    }
  }

}

