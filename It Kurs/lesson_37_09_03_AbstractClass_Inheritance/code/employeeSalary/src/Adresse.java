//Задача 1. Создать класс Address, расширяющий класс Employee.
// Реализовать в нем конструктор и геттеры.
// В классе Main создать двух работников с адреcами, напечатаь в консоли их адреса.
public class Adresse extends Employee{
String adresse;

  public Adresse(String name, String email, int ID_num, String adresse) {
    super(name, email, ID_num);
    this.adresse = adresse;
  }

  public String getAdresse() {
    return adresse;
  }
}
