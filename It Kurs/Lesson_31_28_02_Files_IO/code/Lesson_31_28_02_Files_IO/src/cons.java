import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class cons {

  public static void main(String[] args) //throws IOException
  {

    //BufferedReader с методом read, чтение посимвольно
    String st = "C:\\Users\\AIT TR Student\\IdeaProjects\\It\\src\\l_28_02_Files_IO\\text.txt";
    try (FileReader fileReader = new FileReader(st);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
    ) {
      // FileReader fileReader = new FileReader(st);
      //BufferedReader bufferedReader = new BufferedReader(fileReader);
      // Так надо писать close()
      int c;
      // c = (char) bufferedReader.read();
      while ((c = bufferedReader.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    // BufferedReader, метод readLine(), чтение построчно
    try {
      FileReader fr = new FileReader("text.txt");
      BufferedReader br = new BufferedReader(fr);

      String s;

      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
      br.close();

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    //BufferedWriter FileWriter

  }

}
