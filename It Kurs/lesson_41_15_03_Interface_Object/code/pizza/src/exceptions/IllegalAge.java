package exceptions;//package exceptions;// Иногда мы хотим разделить системные и наши собственные исключения.
// Системные должны приводить к падению программы, а собственные мы
// хотим перехватывать и обрабатывать.

// Тогда мы можем создать собственное исключение, которое унаследуем от
// системного. Например, от Exception - базового класса для исключений.

// Если исключение унаследовать от Exception, оно станет проверяемым!

import exceptions.Alcohol2;

// Такое исключение сразу можно "выбрасывать" - throw
public class IllegalAge extends Exception {

  public IllegalAge(int age) {
    super("Вы слишком молоды: " + age + " меньше " + Alcohol2.legalAge);
  }

  public IllegalAge(String message) {
    super(message);
  }
}