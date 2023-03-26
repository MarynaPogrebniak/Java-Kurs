import java.util.Comparator;

public class RectangleComparator implements Comparator<Rechtangle> {

  @Override
  public int compare(Rechtangle o1, Rechtangle o2) {
    return o1.square()-o2.square();
  }
}
