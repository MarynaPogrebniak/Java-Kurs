public class Rechtangle {
  //Создать класс Rectangle (прямоугольник), которому в конструкторе нужно передавать длину и ширину.
  //
  //Написать компаратор, который сравнивает прямоугольники по площади.
  //
  //Написать тесты для этого компаратора.

private final int length;
private final int width;

  public Rechtangle(int length, int width){
  this.length = length;
  this.width = width;
}
  public int square() {
    return length * width;
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }

  @Override
  public String toString() {
    return "Прямоугольник " +
        "length=" + length +
        ", width=" + width;
  }
}
