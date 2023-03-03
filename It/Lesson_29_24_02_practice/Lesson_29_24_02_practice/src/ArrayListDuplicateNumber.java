import java.util.ArrayList;

public class ArrayListDuplicateNumber {

  public static void main(String[] args) {
    //О единственном дубликате в массиве целых чисел от 1 до 100.
    // Дан массив последовательных натуральных чисел от 1 до 100.
    // В этом массиве есть один и только один продублированный
    // элемент. Как его найти?

    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add(i, i + 1);
    }
    System.out.println(numbers);
    int sum = 0;

    for (int i = 0; i < numbers.size(); i++) {
      sum = sum + numbers.get(i);
    }
    System.out.println("Длина массива " + numbers.size() + " сумма всех элементов " + sum);

    int randomDuplicate = (int) (Math.random() * (100 - 1 + 1) + 1);
    System.out.println(randomDuplicate);

    numbers.add(randomDuplicate, randomDuplicate);
    System.out.println(numbers);

    int sum1 = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum1 = sum1 + numbers.get(i);
    }
    System.out.println("Длина нового массива " + numbers.size() + " сумма всех элементов " + sum1);
    int duplicateNumber = sum1 - sum;

    System.out.println("Дубликат " + duplicateNumber);
  }

}
