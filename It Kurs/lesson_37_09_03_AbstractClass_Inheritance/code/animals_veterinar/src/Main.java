import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Bear bear1 = new Bear("bear", "Brown bear");
    Cat cat1 = new Cat("cat", "Persian");
    Dog dog1 = new Dog("dog", "Setter");
    Vet vet1 = new Vet("Aibolit");

    List <Animal> animalArrayList = new ArrayList<>(3);
    animalArrayList.add(bear1);
    animalArrayList.add(cat1);
    animalArrayList.add(dog1);
    System.out.println(animalArrayList);

    Scanner sc = new Scanner(System.in);
    String choice = "";
    int i = 0;

//        vet1.treatAnimal((Animal) animals.get(0));
//        vet1.treatAnimal((Animal) animals.get(1));

    for (int j = 0; j < animalArrayList.size(); j++) {
      animalArrayList.get(j).eat();
      animalArrayList.get(j).makeNoise();
    }

    while (true){
      if (i < 3) {
        vet1.treatAnimal((Animal) animalArrayList.get(i));
        i++;
      } else {
        System.out.println("Очередь из зверей закончилась.");
        break;
      }
      System.out.println("Следующий? y/n ");
      choice = String.valueOf(sc.nextLine());
      if (choice == "n") {break;}
    }
  }
}