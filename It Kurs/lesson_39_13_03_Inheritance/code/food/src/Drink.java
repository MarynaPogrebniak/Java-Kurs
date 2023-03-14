import java.util.Scanner;

public class Drink extends Food{

  private boolean carbonatedDrink;
  private boolean alcoholicDrink;


  public Drink(String nameFood, int calories, boolean carbonatedDrink, boolean alcoholicDrink) {
    super(nameFood, calories);
    this.carbonatedDrink = carbonatedDrink;
    this.alcoholicDrink = alcoholicDrink;
  }

  //  метод "открыть", который:
//  для газированного напитка печатает "пшш",
//  для негазированного - "скр",
//  а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
  public void openDrink (boolean carbonatedDrink, boolean alcoholicDrink) {
    if (carbonatedDrink) {
      System.out.println("пшш");
    } else {
      System.out.println("скр");
    }

    if (alcoholicDrink) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите Ваш возраст");
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("парампампампшшшшшшш");
    } else {
      System.out.println("Вам возраст меньше 18");
    }
    }
  }
}
