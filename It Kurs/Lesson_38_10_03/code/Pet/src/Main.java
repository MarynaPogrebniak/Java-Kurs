import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  //Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//
//Формат входных данных: количество строк с записями о домашних животных, затем сами записи в описанном формате.
  public static void main(String[] args) throws IOException {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List <Pet> pets = new ArrayList<>();
    System.out.println("quantity");
   int petsss= Integer.parseInt(br.readLine());
    for (int petsId = 0; petsId < petsss; ++petsId) {
      readKind(br, pets);
    }
      for (Pet pet : pets) {
        System.out.println("Name " + pet.getName() + ", weight " + pet.getWeight() + ", kind " +pet.getKind() + ", birthday " + pet.getBirthday());
    }

  }private static void readKind(BufferedReader br, List<Pet> pets) throws IOException {
    System.out.println("kindname");
    String kindName = br.readLine();
    System.out.println("kindNumber");
    int kindNumber = Integer.parseInt(br.readLine());
    for (int i = 0; i < kindNumber; ++i) {
      System.out.println("line");
      String line = br.readLine();
      Pet pet = Pet.parsePet(kindName, line);
      pets.add(pet);
    }
  }
}
