import java.awt.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

ArrayList<Rechtangle> rechtangles = new ArrayList<>();
    Rechtangle first = new Rechtangle(2,3);
    Rechtangle second = new Rechtangle(4,5);
    System.out.println("Площади, начиная с меньшей");
    rechtangles.add(first);
    rechtangles.add(second);

    rechtangles.sort(new RectangleComparator());
    for (Rechtangle r: rechtangles) {
      System.out.println(r);
      System.out.println("Площадь прямоугольника: " + r.square());
    }
  }
}