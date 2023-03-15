import java.util.ArrayList;
import java.util.List;

public class Main {
//Когда-то давно на уроках труда в школе  девочки учились гововить суп, а мальчики
// делали табуретки. Написать программу,в которой создаются классы
// Boy and Girl, имеющие 3 поля- имя,фамилия, возраст.
// Затем в классе Main создать по два обьекта этих классов, поместить их в массив и вывести на экран информацию
// о них, а также результат работы метода work.
  public static void main(String[] args) {

    Girl girl1 = new Girl("Алена", "Белая", 14);
    Girl girl2 = new Girl("Катя", "Иванова", 12);
    Boy boy1 = new Boy("Петя", "Петров", 13);
    Boy boy2 = new Boy("Ваня", "Иванов", 15);

    //System.out.println(girl1.toString());
    girl1.work();
    boy1.work();

    List<Student> students = new ArrayList<>();
    students.add(girl1);
    students.add(girl2);
    students.add(boy1);
    students.add(boy2);

    for (Student student: students) {
      System.out.println(student);
      student.work();
      System.out.println();
    }

  }
}