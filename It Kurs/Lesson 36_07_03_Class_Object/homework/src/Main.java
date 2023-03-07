public class Main {

  public static void main(String[] args) {
    Dogs firstDog = new Dogs("American Bulldog", "Ruf", 5.4, 10);
    Dogs secondDog = new Dogs("Azawakh", "Nelly", 8.4, 3);
    Dogs thirdDog = new Dogs("Barbet", "Chucky", 6.2, 5);

    System.out.println(firstDog);
    System.out.println(secondDog);
    System.out.println(thirdDog);

    System.out.println("First dog age is " + firstDog.getAge());
    System.out.println("Second dog name is " + secondDog.getBreed());
    System.out.println("Third dog name is " + thirdDog.getName());

    firstDog.setAge(-11); //Age should be greater than 0
    System.out.println("First dog age is " + firstDog.getAge());
    firstDog.setAge(11);
    System.out.println("First dog age is " + firstDog.getAge());

  }
}