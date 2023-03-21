package homework;
//Задача 1.
//Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать" CanRun с методом run
// и "умеет плавать" CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.
//
//Задача 2.
//Реализуйте соответствующие интерфейсы из предыдущей задачи в классах
// "Человек", "Утка", "Пингвин" и "Самолёт".
public class Runner {

  public static void main(String[] args) {

    Airplane testAirplane = new Airplane();
    Duck testDuck = new Duck();
    Human testHuman = new Human();
    Pinguin testPinguin = new Pinguin();
    Superman testSuperman = new Superman();

    testAirplane.canFly();
    testDuck.canSwim();
    testHuman.canRun();
    testPinguin.canSwim();
    testSuperman.canFly();
  }
}
