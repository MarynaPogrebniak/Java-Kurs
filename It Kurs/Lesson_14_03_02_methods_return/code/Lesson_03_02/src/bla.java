//Перегрузка методов
public class bla {
    public static void main(String[] args) {
        int sum = Sum(4, 5);
        System.out.println(sum);
        sum = Sum(1, 2, 4);
        System.out.println(sum);
        double sum1 = Sum(2.4, 2.4);
        System.out.println(sum1);
    }

    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double Sum(double a, double b) {
        double sum = a + b;
        return sum;
    }


    public static int Sum(int a, int b, int c) {
        int sum = a * b * c;
        return sum;
    }


}
