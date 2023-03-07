
public class Main {

  public static void main(String[] args) {

    Wine firstWine = new Wine();
    firstWine.name = "Natale Verga Il Gaggio";
    firstWine.sort = "Pino Grigio";
    firstWine.year = 2017;

    Wine secondWine = new Wine();
    secondWine.name = "Orion Wines Maree d'Ione Nero di Troia";
    secondWine.sort = "Nero di Troia";
    secondWine.year = 2020;

    Wine thirdWine = new Wine();
    thirdWine.name = "Colterenzio Pfefferer";
    thirdWine.sort = "Mosacato";
    thirdWine.year = 2021;

    System.out.println(firstWine);
    System.out.println(secondWine);
    System.out.println(thirdWine);

    System.out.println();
    firstWine.onStock();

    System.out.println();

    System.out.println("First wine year " + firstWine.getYear());
    System.out.println("Second wine year " + secondWine.getYear());
    System.out.println("Third wine year " + thirdWine.getYear());

  }
}