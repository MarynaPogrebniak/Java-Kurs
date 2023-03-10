/*  Создать абстрактный класс Animal и расширяющие его классы Dog, Cat, Bear.

    Класс Animal содержит переменную name и абстрактные методы makeNoise, eat, getDescription.
    Метод makeNoise, например, может выводить на консоль звуки животных, описанных буквами.
    Метод eat выводит на консоль список того, чем питается данное животное.
    Метод getDescription возвращает описание животного.
    Методы Dog, Cat, Bear переопределяют методы makeNoise, eat, getDescription.
    Создайте класс Ветеринар (Vet), в котором определите метод void treatAnimal(Animal animal).
    Пусть этот метод распечатывает name и описание пришедшего на прием животного.
    В методе main создайте массив типа Animal, в который запишите животных всех имеющихся
    у вас типов. В цикле отправляйте их на прием к ветеринару.
    В отдельном цикле вызовите методы makeNoise, eat для каждого животного.
*/
public abstract class Animal {
String name;


  public void setName(String name) { //setter
    this.name = name;
  }
  public Animal (String name) { //конструктор
    this.name = name;
  }
  public void makeNoise(){
  }
  public void  eat (){
  }
public void getDescription (){

}

}
