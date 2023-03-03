# Files I/O

# Файловая сруктура соджержит:

директории и вложенные директории

#### последовательность вложенных директорий - это называется путь (path) к файлу

**файлы**: именованная область памяти, содержащая две части, разделенные точкой

имя файла
расширение имени, например .txt, .doc, .jpg, .pdf, которое говорит о типе хранимой в файле
информации

Работаем с файлами из Java-кода
Открываем ссылку https://www.w3schools.com/java/java_files.asp Берем примеры кода и пробуем
реализовать у себя

Шаг 1. Создание файла import java.io.File; // Import the File class File myObj = new File("
filename.txt"); // Specify the filename

Шаг 2. Запись информации в файл FileWriter myWriter = new FileWriter("filename.txt");
myWriter.write("Files in Java might be tricky, but it is fun enough!"); myWriter.close(); Шаг 3.
Чтение информации из файла File myObj = new File("filename.txt"); Scanner myReader = new Scanner(
myObj); while (myReader.hasNextLine()) { String data = myReader.nextLine(); System.out.println(
data); myReader.close();