import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    String title1 = o1.getTitle();
    String title2 = o2.getTitle();
    if (!title1.equals(title2)) {
      return title1.compareTo(title2);
    }
    return o1.getAuthor().compareTo(o2.getAuthor());
  }
}
