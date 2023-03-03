public class homework_08_02 {
    public static void main(String[] args) {
        //Задача 1. Создать массив, в котором храняться названия дней недели. Вывести на печать выходные дни.

        String[] array_days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(array_days[5] + " and " + array_days[6]);

        //Задача 2. Создать массив, содержащий данные о дневной температуре
        //в вашем городе с начала февраля 2023 года. Определить среднюю температуру месяца.

        int[] array_temerature = new int[]{2, 2, 1, 2, 3, 3, 2, 2};

        double sum = 0;
        double average = 0;
        for (int i = 0; i < array_temerature.length; i++) {
            sum = sum + array_temerature[i];
        }
        System.out.println("sum is " + sum);

        average = sum / array_temerature.length;

        System.out.println("Average temperature is " + average);

        //Задача 3(*). Создать массив, в котором храняться даты и температуры.
        // Вывести на печать таблицу с данными оо температуре по дням и среднюю температуру за период наблюдения.

        // 1 variant
        String[] array_dates = new String[]{"1 February", "2 February", "3 February", "4 February",
                "5 February", "6 February", "7 February", "8 February"};

        int[] array_temperature = new int[]{2, 2, 1, 2, 3, 3, 2, 2};

        for (int i = 0; i < array_dates.length && i < array_temperature.length; i++) {
            System.out.println(array_dates[i] + " is " + array_temperature[i] + " degrees");

        }

        // 2 variant
        String[] array_date_temperature = new String[]{"1 February", "2", "2 February", "2", "3 February", "1", "4 February", "2",
                "5 February", "3", "6 February", "3", "7 February", "2", "8 February", "2"};

        for (int i = 0; i < array_date_temperature.length; i++) {
            System.out.println(array_date_temperature[i] + " is " + array_date_temperature[(i + 1)]);
            i++;
        }

        double sum1 = 0;

        for (int i = 1; i < array_date_temperature.length; i++) {

            int a = Integer.parseInt(array_date_temperature[i]);
            // System.out.println(a);
            sum1 = sum1 + a;
            i++;
        }
        // System.out.println("Sum is " + sum1);
        double avarage = sum1 / (array_date_temperature.length / 2);
        System.out.println("Average is " + avarage);
    }
}
