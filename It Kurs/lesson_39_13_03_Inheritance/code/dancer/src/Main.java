import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("Пример наследования с классом Dancer");

    TwistDancer firstTwistDancer = new TwistDancer("Vasya", 28, "m");
    BreakDancer firstBreakDancer = new BreakDancer("Alena", 23, "f");

    firstBreakDancer.dance();
    firstTwistDancer.dance();

    List<Dancer> dancerList = new ArrayList<>();
    dancerList.add(firstBreakDancer);
    dancerList.add(firstTwistDancer);

    for (int i = 0; i < dancerList.size(); i++) {
      System.out.println(dancerList.get(i));
    }
  }
}
