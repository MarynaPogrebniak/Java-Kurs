public class Wine {
String name;
String sort;
int year;

  @Override
  public String toString() {
    return "Wine " +
        "name = '" + name + '\'' +
        ", sort = '" + sort + '\'' +
        ", year = " + year;
  }

  public static int onStock(int quantity) {

 return quantity;
  }

  public int getYear() {

    return year;
  }
}
