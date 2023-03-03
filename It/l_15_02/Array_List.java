package l_15_02;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

  public static void main(String[] args) {
    //создадим список авто
    ArrayList<String> brandList = new ArrayList<String>();

    brandList.add("BMW");
    brandList.add("Mercedes");
    brandList.add("VW");
    brandList.add("Ford");
    brandList.add("Fiat");
    brandList.add("Opel");

    System.out.println(brandList);

    int size = brandList.size(); //размер листа
    System.out.println("Размер листа " + size);

    int index = brandList.indexOf("Fiat"); //номер элемента
    System.out.println("Номер (index) " + "Fiat" + " в списке " + index);

    System.out.println(brandList.get(4)); //вывод 4го номера листа

    brandList.remove(4); //удаляем 4й номер из листа
    System.out.println(brandList); //печать после удаления

    boolean BrandPresents = brandList.contains("Opel"); //проверка на наличие
    System.out.println(BrandPresents);

    //проверяем что обьект есть в списке, тогда он не добавляется в список
    if (brandList.contains("Opel") == false) {
      brandList.add("Opel");
    }
    System.out.println(brandList);

    //добавим отсутствующий элемент в список, если его нет в списке
    if (brandList.contains("Audi") == false) {
      brandList.add("Audi");
    }
    System.out.println(brandList);

    //распечатка листа с индексами
    for (int i = 0; i < brandList.size(); i++) {
      System.out.println(i + " " + brandList.get(i));
    }

    //сортировка листа

    Collections.sort(brandList); //вызов алгоритма сортировки
    for (int i = 0; i < brandList.size(); i++) {
      System.out.println(i + " " + brandList.get(i));
    }
  }
}
