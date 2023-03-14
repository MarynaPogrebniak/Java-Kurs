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

    if (alcoholicDrink) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите Ваш возраст");
      int age = sc.nextInt();

      if (age >= 18) {
        if (carbonatedDrink) {
          System.out.println("Напиток алкогольный, газированный. пшш");
        } else {
          System.out.println("Напиток алкогольный, негазированный. скр");
        }
      } else System.out.println("Вам возраст меньше 18");
    }

    else if (carbonatedDrink) {
      System.out.println("Напиток безалкогольный, газированный. пшш");
    } else {
      System.out.println("Напиток безалкогольный, негазированный. скр");
    }
  }
}
