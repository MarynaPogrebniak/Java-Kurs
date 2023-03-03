package l_30_01;

public class h_30_01 {
    public void h_30_01() {

        // Даны два целых числа. Написать программу, выводящую на экран или их сумму или,
        //если эти числа равны, то двойную сумму.
        int a = 5;
        int b = 5;

        if (a != b) {
            System.out.println("a!=b sum is " + (a + b));
        } else {
            System.out.println("a=b sum is " + (a + b) * 2);
        }

    }
}
