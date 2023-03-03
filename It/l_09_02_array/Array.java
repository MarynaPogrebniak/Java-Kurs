package l_09_02_array;

public class Array {
    public static void main(String[] args) {
        // арифмет прогрессия A (n) = A1 + d*(n-1),
        // d разница прогрессии, А1 первый член.
        // A1 = 15, d =7. Сформировать массив из 10 первых чисел
        //Вывксти в строку

        int[] array_arifm = new int[10];
        int A1 = 15;
        int d = 7;

        for (int i = 0; i < array_arifm.length; i++) {

            array_arifm[i] = A1 + d * (i);
            System.out.print(array_arifm[i] + " | ");

        }


        System.out.println();
        System.out.println();
        // заполнение случайными числами
        // бросаем кубик с 6-ю гранями 20 раз

        int[] cube = new int[20];

        for (int i = 0; i < cube.length; i++) {
            cube[i] = (int) ((Math.random() * (6 - 1 + 1) + 1));
            System.out.print(cube[i] + " | ");
        }

        System.out.println();
        System.out.println();

        //orel i reshka
        int[] coin = new int[20];

        for (int i = 0; i < coin.length; i++) {
            coin[i] = (int) ((Math.random() * (2 - 1 + 1) + 1));
            System.out.print(coin[i] + " | ");
        }

       
    }
}
