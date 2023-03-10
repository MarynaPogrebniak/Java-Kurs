import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Треугольник - проверка на возможность существования");
    System.out.println();
    BufferedReader br = null; //обнуляем буффер
    br = new BufferedReader(new InputStreamReader(System.in));


    System.out.println("Введите 1-ю сторону треугольника: ");
    int a = Integer.parseInt(br.readLine());
    System.out.println("Введите 2-ю сторону треугольника: ");
    int b = Integer.parseInt(br.readLine());
    System.out.println("Введите 3-ю сторону треугольника: ");
    int c = Integer.parseInt(br.readLine());

    br.close();

    Triangle t1 = new Triangle(a, b, c);

  }
}
