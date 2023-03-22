package homework;

import java.util.ArrayList;
import java.util.List;

//Задача 1.
//Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать" CanRun с методом run
// и "умеет плавать" CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.
//
//Задача 2.
//Реализуйте соответствующие интерфейсы из предыдущей задачи в классах
// "Человек", "Утка", "Пингвин" и "Самолёт".
public class Runner {

  public static void main(String[] args) {

    List<CanFly> flyable = new ArrayList<>();
    List<CanRun> runnable = new ArrayList<>();
    List<CanSwim> swimmable = new ArrayList<>();


    Airplane testAirplane = new Airplane();
    flyable.add(testAirplane);

    Duck testDuck = new Duck();
    flyable.add(testDuck);
    runnable.add(testDuck);
    swimmable.add(testDuck);

    Human testHuman = new Human();
    runnable.add(testHuman);
    swimmable.add(testHuman);

    Pinguin testPinguin = new Pinguin();
    swimmable.add(testPinguin);
    runnable.add(testPinguin);

    Superman testSuperman = new Superman();
    flyable.add(testSuperman);
    swimmable.add(testSuperman);
    runnable.add(testSuperman);

    System.out.println("Все полетели и я полетел!");
    for (CanFly flyingObject : flyable) {
      flyingObject.canFly();
      // flyingObject.run(); // ошибка, мы ничего не знаем про run, у нас List<CanFly>
      if (flyingObject instanceof Superman superman) {
        System.out.print("ЭТО БЫЛ СУПЕРМЕН! Он умеет бегать: ");
        superman.canRun();
      }
    }
    System.out.println();

    System.out.println("Все побежали и я побежал!");
    for (CanRun runningObject : runnable) {
      runningObject.canRun();
    }
    System.out.println();

    swim(swimmable);
  }

  public static void swim(List<CanSwim> swimmable) {
    System.out.println("Все поплыли и я поплыл...");
    for (CanSwim swimmingObject : swimmable) {
      swimmingObject.canSwim();
    }
  }
}

