import java.util.Comparator;

public class BookPagesDescendingComparator implements Comparator<Book> {
 // Задача 2* (не обязательно)
 // Создайте компаратор, который позволит сортировать книги по убыванию количества страниц,
  // а при совпадающем объёме - по названиям ("по возрастанию", по алфавиту).

  @Override
  public int compare(Book o1, Book o2) {

    if (o1.getPages() != o2.getPages()){
      return o2.getPages() - o1.getPages();
    }
    return o1.getTitle().compareTo(o2.getTitle());
  }
}
