import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RechtangleComparatorTests {

  @Test
  public void addPositiveIntegers(){
  Rechtangle first = new Rechtangle(2,3);
  Rechtangle second = new Rechtangle(3,2);

    int resultFirst = first.square();
    int resultSecond = second.square();
    assertEquals(6,resultFirst);
    assertEquals(6, resultSecond);
}


}
