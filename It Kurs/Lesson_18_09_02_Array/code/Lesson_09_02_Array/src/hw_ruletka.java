public class hw_ruletka {

  public static void main(String[] args) {
    // Задача 2. Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 ячеек,
    // куда может попасть шарик, и два цвета - красный, черный.
    // Результат попытки вывести так: "Выиграл номер NN, четное или нечетное, цвет"

    int[] roulette = new int[20];
    for (int i = 0; i < roulette.length; i++) {

      roulette[i] = (int) ((Math.random() * (36 - 1 + 1) + 1));
      System.out.print("Won number " + roulette[i] + ", ");
        if (roulette[i] % 2 == 0) {
            System.out.println("red and even");
        } else {
            System.out.println("black and odd");
        }

    }

  }
}
