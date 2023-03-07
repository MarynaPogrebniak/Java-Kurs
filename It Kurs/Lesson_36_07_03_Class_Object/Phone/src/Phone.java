
/*  Создайте класс Phone, который содержит переменные number, brand и model.
    Создайте три экземпляра этого класса. Выведите на консоль значения
    их переменных методом toString.
    Добавить в класс Phone метод: receiveCall, имеет один параметр –
    имя звонящего. Выводит на консоль сообщение “Звонит name”.
    Задайте метод getNumber – возвращает номер телефона.
    Вызвать этот метод для каждого из объектов. Добавить конструктор
    в класс Phone, который принимает на вход три параметра для
    инициализации переменных класса- number, brand и model.
    Добавить в класс setter и getter. */
public class Phone {
String phoneNumber;
String brand;
String model;



  @Override
  public String toString() {
    return "Phone{" +
        "number='" + phoneNumber + '\'' +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
  public void receiveCall (String name) {
    System.out.println("Звонит " + name);
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Phone(String phoneNumber, String brand, String model) {
    this.phoneNumber = phoneNumber;
    this.brand = brand;
    this.model = model;
  }
}
