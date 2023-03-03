public class hw_stock_index {
    public static void main(String[] args) {
        //Задача 3. Смоделировать поведение биржевого индекса в течение месяца.
        // Биржевой индекс выбрать самостоятельно, данные о его изменениях взять из Интернета,
        // месяц - январь 2023 года.
        //01.01 4.076,60 31.01	4.134,18

        int[] date = new int[31];
        int a = 1;
        for (int i = 0; i < date.length; i++) {
            date[i] = a;
            a = a + 1;
        }
        double[] stock = new double[31];
        for (int i = 0; i < stock.length; i++) {
            stock[i] = (Math.random() * (4134.18 - 4076.6)) + 4076.6;
            System.out.println(date[i] + " January " + "stock index was " + stock[i]);
        }

    }
}
