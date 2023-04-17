package homework61_student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //    каждый ученик выведен в отдельной строке
//    сумма баллов каждого ученика выше минимального проходного
//    ученики отсортированы по убыванию среднего балла
//    в списке не больше 10 учеников (извините, конкурс)
//    Для обработки и вывода результата используйте потоки (Stream).
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrew", 84));
        students.add(new Student("Petr", 96));
        students.add(new Student("John", 51));
        students.add(new Student("Oleg", 18));
        students.add(new Student("Ivan", 76));
        students.add(new Student("Andrew1", 85));
        students.add(new Student("Petr1", 97));
        students.add(new Student("John1", 58));
        students.add(new Student("Oleg1", 64));
        students.add(new Student("Ivan1", 71));
        students.add(new Student("John2", 79));
        students.add(new Student("Oleg2", 19));
        students.add(new Student("Ivan2", 77));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите минимальный проходной балл: ");
        int minScore = Integer.parseInt(bufferedReader.readLine());

        students.stream()
                .filter(student -> student.getScore() > minScore)
                .sorted(((o1, o2) -> o2.getScore() - o1.getScore()))
                .limit(10)
                .forEach(System.out::println);
    }
}
