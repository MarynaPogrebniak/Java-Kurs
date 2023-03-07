public class Main {

  public static void main(String[] args) {
    System.out.println("Пример создания класса");
    // создание класса внутри класса Main

     class Car {
       String brand;
       String color;
       int year;
       String type;

       @Override
       public String toString() {
         return "Car{" +
             "brand='" + brand + '\'' +
             ", color='" + color + '\'' +
             ", year=" + year +
             ", type='" + type + '\'' +
             '}';
       }
     }

     Car myCar = new Car();
     myCar.brand = "Audi";
     myCar.color = "white";
     myCar.type = "hatchback";
     myCar.year = 2021;

    System.out.println("My car: " + myCar.brand + " " + myCar.color + " " +myCar.type + " " +myCar.year);
    System.out.println(myCar); //alt einfg в классе


    Pet myPet = new Pet();
    myPet.type = "cat";
    myPet.breed = "persian";
    myPet.name = "Frosya";
    myPet.color = "beige";
    myPet.age = 12;
    myPet.weight = 2.6;

    System.out.println("I have a " + myPet.type + ", breed " + myPet.breed + ". The Name is " + myPet.name +
    ", weight " + myPet.weight + ", color "+ myPet.color + ", age " + myPet.age );

    System.out.println();
    System.out.println(myPet);

  }

}
