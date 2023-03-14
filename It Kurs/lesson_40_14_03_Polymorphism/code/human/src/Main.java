public class Main {

  public static void main(String[] args) {

  Human human = new Human("Человек", "Человечный");
  Programmer programmer1 = new Programmer("Vasya", "Vasechkin");
  Sportsman sportsman = new Sportsman("Александ", "Александров");
  Marketer marketer = new Marketer("Марина", "Погребняк");

  human.work();
    System.out.println();
  programmer1.work();
    System.out.println();
  sportsman.work();
    System.out.println();
  marketer.work();

  Human human1 = programmer1;
  Human human2 = sportsman;
  Human human3 = marketer;

    System.out.println(human1);
    human1.work();
  }
}