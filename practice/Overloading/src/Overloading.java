public class Overloading {
void show (int i1) {
  System.out.println(i1);
}
void show (boolean b1){
  System.out.println(b1);
}

void  show (String s1) {
  System.out.println(s1);
}
void show (String s, int a) {
  System.out.println("String " + s + " int " + a);
}
  void show (int a, String s) {
    System.out.println("What a wonderful day!");
  }
}
class MethodOverloadingTest {

  public static void main(String[] args) {
  Overloading aO = new Overloading();

  int a = 500;
  aO.show(a);

  boolean b = true;
  aO.show(b);

  String s = "Privet";
  aO.show(s);

  aO.show("Privet", 10);
  aO.show(10, "Privet");

  }
}