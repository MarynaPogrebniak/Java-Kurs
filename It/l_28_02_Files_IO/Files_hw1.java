package l_28_02_Files_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files_hw1 {

  public static void main(String[] args) {

    String path = "C:\\Users\\AIT TR Student\\IdeaProjects\\It\\src\\l_28_02_Files_IO\\";

    try {
      File myFile = new File(path + "homework.txt");
      if (myFile.createNewFile()) {
        System.out.println("File created: " + myFile.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    // Запись в файл текста
    System.out.println("Пример работы с файлом - ЗАПИСЬ в ФАЙЛ");

    try {
      FileWriter myWriter = new FileWriter(path + "homework.txt"); //создаем экземпляр  класса
      myWriter.write(
          "Это домашнее задание номер 1, \nзапись второй строки,\nтретья строка."); // пишем то, что записываем в файл
      myWriter.close(); // закрываем метод
      System.out.println("Успешная запись в файл.");
    } catch (IOException e) { //поймали ошибку и положили ее в пепременную е
      System.out.println("Произошла ошибка.");
      e.printStackTrace();
    }

    // Чтение текста из файла
    System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

    try {
      File myFile = new File(path + "homework.txt");
      Scanner myReader = new Scanner(myFile); // готовим сканер для чтения, передаем нащ файл
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine(); // считываем строку
        System.out.println(data); // печатаем считанную строку
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Произошла ошибка.");
      e.printStackTrace();
    }

  }

}
