package l_09_02_array;

public class hw_array_odd_numbers {
    public static void main(String[] args) {
        //Задача 1. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        // а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int[] odd = new int[50];
        int x = 1;
        for (int i = 0; i < odd.length; i++) {

            odd[i] = x;
            x = x + 2;
            System.out.print(odd[i] + ",");
        }
        System.out.println();

        for (int i = odd.length - 1; i < odd.length && i >= 0; i--) {
            System.out.print(odd[i] + ",");
        }
    }


}
