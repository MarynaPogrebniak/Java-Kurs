package collections;

// программа должна:

// получить от пользователя:
// количество студентов
// информацию о студентах:
// - имя
// - рейтинговый балл (целое число)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// вывести на экран:
// вариант 1: информацию о студентах в алфавитном порядке
// вариант 2: информацию о студентах в порядке убывания рейтинга
public class StudentDatabase {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество студентов: ");
    int n = Integer.parseInt(br.readLine());

    // варианты:

    // плохие решения, не подходят:
    // Map<String, Integer> - легко отсортировать по алфавиту, но не получится записать тёзок
    // Map<Integer, String> - легко отсортировать по рейтингу, но нельзя повторять рейтинг

    // сложные решения, сортировка вручную:
    // List<String>, List<Integer> - легко сортировать по отдельности, но сохранять совпадение
    // порядка очень сложно - придётся как-то сортировать вручную
    // List<Map<String, Object>> использовать мини-словарь для каждого студента (JSON) -
    // (или многомерный массив Object[][] или List<List<Object>>) - тоже придётся как-то
    // сортировать вручную

    // медленное решение, неэффективно:
    // Map<Integer, String> "id-имя" и Map<Integer, Integer> "id-оценка" - можно, но работать
    // будет неэффективно - очень медленно для большого количества студентов

    // "хак", должно сработать:
    // List<String>, где String - серализованный студент вида "имя;рейтинг"
    // сериализуем (склеиваем строку) для сортировки, разъединяем для вывода
    // для сортировки по рейтингу "рейтинг;имя" придётся дополнять слева нулями:
    // сравнение строк: "23" < "9", но "23" > "09"

    // хотелось бы:
    // List<Student> - не понятно, как сортировать
    List<Student> students = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      students.add(Student.readStudent());
    }

    Collections.sort(students);
    for (Student student : students) {
      System.out.println(student);
    }
  }
}