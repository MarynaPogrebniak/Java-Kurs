import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book implements Comparable <Book>{

//Создайте класс Book (книга), в конструктор которого передавайте автора, название книги и количество страниц.

  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public static Book readBook () throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите автора: ");
    String author = br.readLine();
    System.out.print("Введите название книги: ");
    String title = br.readLine();
    System.out.print("Введите количество страниц: ");
    int pages = Integer.parseInt(br.readLine());
    return new Book(author, title, pages);
  }

  @Override
  public String toString() {
    return author + ": " + title + ", количество страниц: " + pages;
  }

  @Override
  public int compareTo(Book other) {
    if (!author.equals(other.author)) { // если автор не одинаковый
      return author.compareTo(other.author); // то сравниваем авторов
    }
    // сюда попали, если автор одинаковый, и сравниваем названия книг
    return this.title.compareTo(other.title);
  }
}

