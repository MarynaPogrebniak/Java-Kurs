public class cons {
    public static void main(String[] args) {

        String string = "Hello World";
        System.out.println(ourSubstring(string, 8, 7));

    }

    public static String ourSubstring(String str, int begin, int end) {

        if (begin < 0 || begin > end)
            return "invalid index";

        String result = "";

        for (int i = begin; i < end && i < str.length(); i++) {
            result = result + str.charAt(i);


        }
        return result;
        //Написать метод, который с помощью цикла for реализует метод substring для варианта с двумя индексами

    }

    //2. Написать метод, проверяющий повторяются ли две подстроки одна длиной 3 другая длиной 4 одинаковое
    //        // количество раз в данной строке
    //        //String str =blueredredredcampdfgblueghhblue
    //        // str3 = red
    //        // str4 =blue
    //        //public boolean checkStrings (String str,String str3, String str4)

    
}
