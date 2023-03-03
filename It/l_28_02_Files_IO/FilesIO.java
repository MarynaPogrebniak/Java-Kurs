package l_28_02_Files_IO;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class FilesIO {

  public static void main(String[] args) {

    String path = "C:\\Users\\AIT TR Student\\IdeaProjects\\It\\src\\l_28_02_Files_IO\\";
    
    // File myFile = new File(path + "test.txt");
    try {
      File myFile = new File(path + "test.txt");
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
      FileWriter myWriter = new FileWriter(path + "test.txt"); //создаем экземпляр  класса
      myWriter.write(
          "Это пробная запись текста в файл. \nвторая строка \nтретья строка"); // пишем то, что записываем в файл
      myWriter.close(); // закрываем метод
      System.out.println("Успешная запись в файл.");
    } catch (IOException e) { //поймали ошибку и положили ее в пепременную е
      System.out.println("Произошла ошибка.");
      e.printStackTrace();
    }

    // Чтение текста из файла
    System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

    try {
      File myFile = new File(path + "test.txt");
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

