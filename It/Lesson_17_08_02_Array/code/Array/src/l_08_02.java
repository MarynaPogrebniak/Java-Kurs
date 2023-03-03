public class l_08_02 {
    public static void main(String[] args) {
        /*
        Задача 1: Опрелеить массив для хранения 10 чисел.
        Заполнить массив целыми числами кратными 10 от 10 до 100.
        Распечатать элементы массива в виде:
        Element at index 0: значение эленета.
         */

        int[] numArray = new int[10];

        for (int i = 0; i < numArray.length; i++) { //цикл по всем элемантам массва
            numArray[i] = i * 10 + 10; //заполняем массив
            System.out.println("Element at index " + i + " is " + numArray[i]);
            //Задача 2: Сложить все элементы массива из Задачи 1 и вывести результат.

        }
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];

        }
        System.out.println("Sum of elements of Array is " + sum);


        //Задача 3. Даны оценки двух учеников за четверть:
        // Ученик1: 5, 3, 3, 4, 5, 4, 5, 5
        // Ученик2: 3, 4, 5, 5, 2, 5, 4
        // Найдите средний балл для каждого ученика и выясните,
        // кто из них лучше учится.

        int[] array_student1 = new int[]{5, 3, 3, 4, 5, 4, 5, 5};
        int[] array_student2 = new int[]{5, 3, 3, 4, 5, 4, 5, 5};

        double sum1 = 0;
        double sum2 = 0;

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < array_student1.length; i++) {
            sum1 = sum1 + array_student1[i];

        }
        for (int i = 0; i < array_student2.length; i++) {
            sum2 = sum2 + array_student2[i];

        }

        average1 = sum1 / array_student1.length;
        average2 = sum2 / array_student2.length;


        if (average1 > average2) {
            System.out.println("First student is better");
        }
        if (average2 > average1) {
            System.out.println("Second student is better");
        }
        if (average2 == average1) System.out.println("Both students are same");
    }
}

