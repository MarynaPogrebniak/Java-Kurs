public class Wine {
String name;
String sort;
int year;
static int onStock = 3;

  @Override
  public String toString() {
    return "Wine{" +
        "name='" + name + '\'' +
        ", sort='" + sort + '\'' +
        ", year=" + year +
        '}';
  }

  public static void onStock() {
    System.out.println("На складе имеется " + onStock + " бутылки");
  }

  public int getYear() {
    return year;
  }
}
