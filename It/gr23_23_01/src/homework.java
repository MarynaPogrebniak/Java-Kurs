public class homework {
    public static void main(String[] args) {
         /*
        Даны два целые числа a и b. Написать логическое выражение, возвращающее true если они равны
         */
        int q = 5;
        int z = 5;
        System.out.println(q == z);
        /*
        Воспитательница в детском саду знает, что если Петя и Вася оба смеются или оба очень серьезные,
        то они что-то затевают и надо быть внимательной. Помогите воспитательнице и напишите логическое
        выражение,дающее true когда оба мальчика смеются или ходят мрачные.
         */
        boolean smeetsya_Petia = true;
        boolean smeetsya_Vasya = true;
        boolean mrachnyi_Petia = true;
        boolean mrachnyi_Vasya = true;
        System.out.println((smeetsya_Petia & smeetsya_Vasya) || (mrachnyi_Petia & mrachnyi_Vasya));

        boolean smeetsya_Petia1 = true;
        boolean smeetsya_Vasya1 = true;

        System.out.println((smeetsya_Petia1 & smeetsya_Vasya1) || (!smeetsya_Petia1 & !smeetsya_Vasya1));

        boolean smeetsya_Petia2 = false;
        boolean smeetsya_Vasya2 = false;
        System.out.println(!smeetsya_Petia2 ^ smeetsya_Vasya2);

        boolean smeetsya_Petia3 = false;
        boolean smeetsya_Vasya3 = false;
        System.out.println(smeetsya_Petia3 == smeetsya_Vasya3);

        boolean smeetsya_Petia4 = false;
        boolean smeetsya_Vasya4 = false;
        System.out.println(!(smeetsya_Petia4 ^ smeetsya_Vasya4));
        /*2.Вася рано встает на работу и поэтому рано ложится спать. Сосед Васи любит слушать громкую музыку.
        У Васи проблемы  если сосед слушает музыку и еще нет 7 утра или уже позже 20 часов.
                Написать выражение, принимающее значение true если у Васи проблемы.
        int hour- это время в диапазоне от 0 до 23
        boolean singing
        singing   hour    vasiaInTrouble
        true       6       true
        true       7       false
        false      6       false
*/

        int hour = 0;
        boolean vasiaInTrouble = true;
        System.out.println( ((hour>20) || (hour<7)));

        //21 22 23  0 1 2 3 4 5 6

    }
}
