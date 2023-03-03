public class array_even_numbers {

  public static void main(String[] args) {
    //Задача 3. Задать массив случайных целых чисел в интервале от 1 до 100.
    // Метод должен принимать массив целых чисел в качестве параметра
    // и возвращать количество поопавших в массив чисел, кратных 10.

    int[] even = new int[20];
    for (int i = 0; i < even.length; i++) {
      even[i] = (int) ((Math.random() * (100 - 1 + 1) + 1));
      System.out.print(even[i] + " | ");
    }
    System.out.println(even_method(even));
  }

  public static int even_method(int[] evenInput) {
    int sum = 0;
    for (int i = 0; i < evenInput.length; i++) {
      if (evenInput[i] % 10 == 0) {
        sum = sum + 1;
      }
    }
    System.out.println("Sum of even numbers " + sum);
    return sum;
  }
}
