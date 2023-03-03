package l_09_02_array;

public class hw_fibonachi {

  public static void main(String[] args) {
    //Задача 4. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
    // Первый и второй члены последовательности Фибоначчи равны единицам,
    // а каждый следующий — сумме двух предыдущих.

    int[] fibonaci = new int[20];

    for (int i = 0; i < fibonaci.length; i++) {

        if (i < 2) {
            fibonaci[i] = 1;
        } else {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }

      System.out.print(fibonaci[i] + " ");


    }

  }
}
