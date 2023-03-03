import java.util.HashMap;

public class HashMap_spisok_s_polom {

  public static void main(String[] args) {
    // Задача 2: Создать HashMap с именами и полом членов нашей группы.
    // Подсчитать количество мужчин и женщин.
    System.out.println("Список группы с указанием пола");

    HashMap<String, String> group23 = new HashMap();

    group23.put("Vadim", "men");
    group23.put("Leonid", "men");
    group23.put("Lilian", "men");
    group23.put("Viacheslav", "men");
    group23.put("Katerina", "women");
    group23.put("Dina", "women");
    group23.put("Katerina z", "women");
    group23.put("Maryna", "women");
    group23.put("Valentin", "men");
    group23.put("Oleg", "men");
    group23.put("Evgeny", "men");
    group23.put("Yehor", "men");
    //   System.out.println(group23.get("Maryna"));

    int man = 0; //количество мужчин

    for (String i : group23.keySet()) {
      // System.out.println(group23.get(i));
      if (group23.get(i) == "men") {
        man++;
      }
    }

    System.out.println("Мужчин в группе: " + man);
    int woman = group23.size() - man;
    System.out.println("Женщин в группе: " + woman);

  }

}
