public class Main {
  public static void main(String[] args) {
    System.out.println("Адрес работника.");

    Address a1 = new Address("Иванов Петр", "ivanov_s@mail.com", 101, 86356, "Br St, 14");
    System.out.println(a1.toString());
    System.out.println(a1.getName() + " индекс " + a1.postCode);
    System.out.println(a1.getName() + " улица и дом " + a1.streetAndHouse);

  }
}