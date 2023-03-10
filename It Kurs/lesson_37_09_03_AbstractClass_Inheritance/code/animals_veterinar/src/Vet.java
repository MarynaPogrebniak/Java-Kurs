public class Vet {

  String name;

  public void treatAnimal(Animal animal){

    System.out.println("На приеме " + animal.name);
    animal.getDescription();
  }

  public Vet(String name) {
    this.name = name;
  }
}
