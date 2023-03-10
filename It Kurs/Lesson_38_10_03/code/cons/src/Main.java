public class Main {

  public static void main(String[] args) {

  Person jack = new Person("Jack", 27);
  //  jack.name = "Jack";
  //  jack.age = 25;

    System.out.println(jack);

    jack.canSpeak();
    jack.canWalk();

    //Создать класс Cat, несколько экземпляров класса и вывести
    // на экран количество созданных кошек. Каждая кошка должна
    // иметь имя. Добавить геттеры и сеттеры для того, чтобы
    // показать и изменить количество созданных кошек.

    Cat cat1 = new Cat("Barsik");
    System.out.println(Cat.getCatCount());

    Cat cat2 = new Cat("Murka");

    System.out.println(Cat.getCatCount());

    Cat.setCatCount(100);
    System.out.println(Cat.getCatCount());

//  создать класс калькулятор с 5 действиями.


  }
}