public class Cat {
  private String name;
  private static int catCount;

  public Cat (String name) {
    this.name =name;
    catCount++;
  }

  public static int getCatCount() { //getter
    return catCount;
  }

  public String getName() {
    return name;
  }

  public static void setCatCount(int catCount) {
    Cat.catCount = catCount;
  }
}
