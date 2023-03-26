import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BookTests {

  @Test
  public void BookWithNegativePages() {
    boolean exceptionThrown = false;
    try {
      Book b = new Book("", "", -5);
    } catch (IllegalArgumentException e) {
      exceptionThrown = true;
    }
    assertTrue(exceptionThrown);
//    assertThrowsExactly(IllegalArgumentException.class, () -> new Book("", "", -5));
  }

  @Test
  public void BookAuthorPagesComparator() {
    // arrange - упорядочить, установить
    Book book1 = new Book("A", "Book", 5);
    Book book2 = new Book("B", "Book", 5);
    Book book3 = new Book("B", "Book", 25);

    List<Book> actual = new ArrayList<>();
    actual.add(book2);
    actual.add(book1);
    actual.add(book3);

    List<Book> expected = new ArrayList<>();
    expected.add(book1);
    expected.add(book3);
    expected.add(book2);

    // act - выполнить действие
    actual.sort(new BookAuthorPagesComparator());

    // assert - сравнить результат с правильным
    assertEquals(expected, actual);
  }
  @Test
  public void BookPagesDescendingComparator (){
    Book book1 = new Book("C", "Book", 25);
    Book book2 = new Book("A", "Book", 25);
    Book book3 = new Book("D", "Book", 26);

    List<Book> actual = new ArrayList<>();
    actual.add(book2);
    actual.add(book1);
    actual.add(book3);

    List<Book> expected = new ArrayList<>();
    expected.add(book3);
    expected.add(book2);
    expected.add(book1);

    actual.sort(new BookPagesDescendingComparator());

    assertEquals(expected, actual);
  }
}