public class Main {
//  Создать класс Food (еда). В классе должны быть:
//
//  поле "название"
//  поле "калорийность"
//  конструктор, геттеры, сеттеры
//  метод "употребить еду" с каким-нибудь выводом.
//  Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//
//  поле "газированный" (да/нет)
//  поле "алкогольный" (да/нет)
//  метод "открыть", который:
//  для газированного напитка печатает "пшш",
//  для негазированного - "скр",
//  а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
  public static void main(String[] args) {

   Food tomatoes = new Food("Tomatoes", 25);
   tomatoes.eatFood();
   System.out.println();

   Drink milk = new Drink("Milk", 30, false, false);
   milk.openDrink(false,false);

   Drink beer = new Drink("Beer", 150, true, true);
   beer.openDrink(true,true);

  }
}