import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {

        String string;

        char ch;
        // System.out.println("Press a key followed by Enter: ");
        //ch = (char)System.in.read();
        //System.out.println("Press a key followed by Enter: ");
        //int code = System.in.read();

        //System.out.println("you entered "+ch);
        //System.out.println("yoe entered char with ASCII code "+code);

        // Классы, объекты, литералы

        String str13 = "new string";
        String usingNew = new String("new string");
        String newStr1;
        String emptyLiteral ="";
        String emptyNewString = new String("");

        System.out.println("empty string is "+emptyLiteral);
        System.out.println("empty new string is "+emptyNewString);

        String nullValue = null;
        System.out.println("nullValue value is "+nullValue);

        String str2 = "Evgeny";
        String str3 = "Evgeny";
        System.out.println(str2==str3);

        String str4 = "Evgeny";

        System.out.println(str2==str4); //true
        String str5 = new String("Evgeny");
        System.out.println(str2==str5); //false
        // nahoditsya po drugomu adressu v pamyati
        // my sravnivaem adressa, hranyaschiesya v pamyati

        String str6 = new String("Evgeny");
        System.out.println(str6==str5); //false

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = new String("Cat");
        System.out.println(s1 + " Dog"); // Cat Dog
        System.out.println(s4==s3); //false. raznye adressa yacheek v pamyati

        // Cat
        // C - 0
        // a - 1
        //t - 2

        String cat = "Cat";
        int catLength = cat.length();
        System.out.println(catLength); //dlina stroki

        char charAtCatIndex = cat.charAt(0);
        System.out.println(charAtCatIndex); //simvol vozvraschaet po indeksu

        String goodcat = "good Cat";
        String substr = goodcat.substring(5); //vozvraschaet novuyu stroku, kot yavlyaetsya podstrokoi dannoi stroki
        System.out.println(substr);
        System.out.println(goodcat);

        String substrGood = goodcat.substring(0, 4);
        System.out.println(substrGood);

        // есть строка. Написать программу, выводяшую
        // на экран целое число
        // равное длине этой строки
        String str = "Maryna";
        int strlength = str.length();
        System.out.println(strlength*2);

        // Дана строка четной длины. написать программу,
        // выводяшую на экран половину этой строки
        String str1 = "Hell";
        String substring = str1.substring(0, 2);
        System.out.println(substring);

        String str10 = "maryna1234";
        int len = str10.length(); //6
        int half = len/2; // polovina 3
        String substring11 = str10.substring(0, half);
        System.out.println(substring11);


        // Написать программу , переставляющую первую букву
        // в конец строки и вывести получившуюся строку в консоль,
        // abcd  bcda

        String hello = "abcd";
        String substring2 = hello.substring(1);
        char end = hello.charAt(0);
        System.out.println(substring2+end);

        // Написать программу , переставляющую последнюю букву
        // в начало строки и вывести получившуюся строку в консоль,
        // abcd  dabc
        String hello1 = "abcd";
        int length = hello1.length();
        char begin = hello1.charAt((length-1));
        String substring5 = hello1.substring(0,(length-1));
        System.out.println(begin+substring5);

        // Hello -> olleH
       String hello2 = "Hello";
       String subhelloH = hello2.substring(0,1);
       String subhelloe = hello2.substring(1,2);
       String subhellol = hello2.substring(2,3);
       int length1 = hello2.length();
       String subhelloo = hello2.substring((length1-1));
       System.out.println((subhelloo)+(subhellol)+(subhellol)+(subhelloe)+(subhelloH));

        String hello3 = "Hello";
        char charH = hello3.charAt(0);
        char chare = hello3.charAt(1);
        char charl = hello3.charAt(2);
        char charo = hello3.charAt(4);
        System.out.print(charo);
        System.out.print(charl);
        System.out.print(charl);
        System.out.print(chare);
        System.out.println(charH);


       /* Даны две строки. Написать программу, выводящую в консоль строки,
          соединенные вместе, но без первых букв. Пример: Hello There -> ellohere*/
        String hello11 = "Hello";
        String there = "there";
        String ello = hello11.substring(1,5);
        String here = there.substring(1,5);
        System.out.println(ello+here);



        //1- есть строка четной длины и нужно вывести на экран эту строку но при этом первая половина
        // букв будет в нижнем регистре а вторая в верхнем
        // Helloh -> helLOH

            String Helloh = "Helloh";
            String substring1 = Helloh.substring(0,3);
            String substring6 = Helloh.substring(3);
            String low = substring1.toLowerCase();
            String up = substring6.toUpperCase();
            System.out.println(low+up);

            //2- Имеется строка. Нужно вывести на экран эту строку без символа, находящегося по индексу index
        // int index =3
        // String str = "Hello"
        // -> Helo

        String hello0 = "Hello";
        int index = 3;
        String first = hello0.substring(0,3);
        String second = hello0.substring(4);
        System.out.println(first+second);

        // есть строка  в которой нужно поменять местами две заданные буквы.
        // Известно, что эти буквы в строке есть.
        //пример: String str = "asDfghjklRre";  поменять D и R

        String asd = "asDfghjklRre";
        System.out.println("Index D "+asd.indexOf('D'));
        System.out.println("Index R "+asd.indexOf('R'));








    }

}