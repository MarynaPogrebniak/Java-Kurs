import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  //Задача 1
  // Используйте класс Book (книга) из предыдущего домашнего задания.
  //
  //Создайте компаратор, который позволит сортировать книги по названию,
  // при одинаковых названиях - по автору (и там, и там - по алфавиту)

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество книг: ");
    int n = Integer.parseInt(br.readLine());

    List<Book> books = new ArrayList<>();
    for (int i = 0; i < n; ++i){
      books.add(Book.readBook());
    }

    System.out.println("Сортировка по автору, а потом по названию книги по алфавиту:");
    Collections.sort(books);
    for (Book book : books) {
      System.out.println(book);
    }

    System.out.println();

    Collections.sort(books, new BookTitleComparator());
    System.out.println("Сортировка по названию книги, а потом по автору по алфавиту:");
    for (Book book : books) {
      System.out.println(book);
    }
    System.out.println();

    Collections.sort(books,new BookPagesDescendingComparator());
    System.out.println("Сортировка книги по убыванию количества страниц, а при совпадающем объёме - по названиям(по возрастанию, по алфавиту)");
    for (Book book : books) {
      System.out.println(book);
    }
  }
}