import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RechtangleComparatorTests {

  @Test
  public void addPositiveIntegers(){
  Rechtangle first = new Rechtangle(2,3);
  int result = first.square();
  assertEquals(6,result);
}


}
