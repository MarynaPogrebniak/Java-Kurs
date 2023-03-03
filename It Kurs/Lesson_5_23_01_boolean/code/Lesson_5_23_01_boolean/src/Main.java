public class Main {
    public static void main(String[] args) {
/*
        Написать программу, определяющую является ли год високосным.
        Год является високосным если
        1. год делится на 4  b грд не делится на 100.
        2-год делится на 4 и год делится без остатка на 100 и если он без остатка делится на 400.
         */

        int year = 1900;
        boolean a1 = (year%4)==0; // god delitsa na 4 togda true
        boolean b1 = (year%100) !=0; //true
        boolean c1 = (year%100==0) && (year%400==0);

        System.out.println(year + " year  is a leap year: " + (a1 && (b1 || c1)));

        boolean a, b, c;
        a=b=c = true;
        System.out.println( a | (b&c) == ( (a|b)&(a|c) ));
        System.out.println( a & (b|c) == ( (a&b)|(a&c) ));


    }
}