
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;

    public class Main {
      public static void main(String[] args)  {
        System.out.println("Список дел");
        // TODO LIST - список дел
        // Меню:
        // - добавить запись
        // - посмотреть записи
        // - удалить запись (по номеру)
        // - выйти

        enum Menu {
          ADD,
          PRINT,
          DELETE,
          EXIT,
        }

        List<String> todoList = new ArrayList<>(); // инициализация листа со списком задач

        // начало раьоты с пользователем
        while (true) {

          for (Menu myMenu : Menu.values()) { // цикл for each - Список, который перебираем, параметр цикла, значения
            System.out.print(myMenu + " | "); // опертор с параметром цикла
          }
          System.out.println();
          System.out.println("Выберите, что надо сделать: нажмите 1, 2, 3 или 4");
          int choice = readMenueChoice(); // выбор пользователя считаем в методе readMenuChoice
          Menu myMenu = Menu.ADD; // начальное значение выбора в меню

          switch (choice) {
            case 1: {
              myMenu = Menu.ADD;
              add_task(todoList); // вызов метода, который добавляе задачу в список задач
              print_tasks(todoList); // вызов метода, который печатает список задач
              break;
            }
            case 2: {
              myMenu = Menu.PRINT;
              print_tasks(todoList);
              break;
            }
            case 3: {
              myMenu = Menu.DELETE;
              remove_task (todoList);
              print_tasks(todoList);
              break;
            }
            case 4: {
              myMenu = Menu.EXIT;
              System.out.println("Спасибо, до свидания!");
              return;
            }
            default:{
              System.out.println("Введите число 1, 2, 3 или 4");
            }
          }
        }

      }
      // метод, который считывает выбор пользователя из меню
      public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
          menuChoice = sc.nextInt();
        } catch (InputMismatchException e ) {
          System.out.println("Нужно вводить числа, а не символы.");
        }
        return menuChoice;
      }

      // метод для добавления задачи в список задач
      public static void add_task(List<String> tasks) {
        System.out.println("Введите задачу: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine(); // считали строку с задачей
        tasks.add(task); // в список tasks вносим методом add новое значение
      }

      // этот метод печатает список задач
      public static void print_tasks (List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
          int n = i + 1; // задаем номер задачи в списке
          System.out.println(n + ". " + tasks.get(i)); // печатаем задачу
          if (tasks.size() == 0) {
            System.out.println("Задач еще нет, начните их добавлять.");
          }
        }
      }

      // этот метод удалляет выбранную пользователем задачу по ее номеру
      public static void remove_task(List<String> tasks) {
        System.out.println("Выберите номер задачи для удаления: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
        if (task_num >= 1 && task_num <= tasks.size()) {
          int n = task_num - 1; // индекс задачи на 1 меньше, чем ее номер на экране
          tasks.remove(n); // удаляем задачу из списка с индексом n1
        } else {
          System.out.println("Выбран неверный номер задачи.");
          return;
        }

      }

    }








/*
 enum Menu {
            ADD_RECORD,
            PRINT_RECORDS,
            DELETE_RECORD,
            EXIT,
        }
        List<String> todoList = new ArrayList<>(); // инициируем лист для списка задач
        while (true){ // начало цикла работы с пользователем
        // печатаем меню
        for (Menu myMenu: Menu.values()) {
            System.out.print(myMenu + " | ");
        }
        System.out.println();
        System.out.println("Выберите, что надо сделать: нажмите 1, 2, 3 или 4");
        int choice = readMenuChoice(); // что выбрал пользователь
        Menu myMenu = Menu.ADD_RECORD;
            // выбор пользователя опции из меню
            switch (choice) {
                case 1: {
                    myMenu = Menu.ADD_RECORD;
                    add_task(todoList);
                    print_tasks (todoList);
                    break;
                }
                case 2: {
                    myMenu = Menu.PRINT_RECORDS;
                    print_tasks (todoList);
                    break;
                }
                case 3: {
                    myMenu = Menu.DELETE_RECORD;
                    remove_task(todoList);
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("До свидания!");
                    return;
                }
            }
        }
    }
    // метод добавляет задачу в список
    public static void add_task (List<String> tasks) {
        System.out.println("Введите задачу: ");
        Scanner sc = new Scanner(System.in);
        String task = sc.next();
        tasks.add(task);
    }
    // метод печатает список задач
    public static void print_tasks(List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            int n = i + 1; // задаем номер задачи
            System.out.println(n + ". " + tasks.get(i)); // печатаем номер и текст задачи
        }
        if (tasks.size() == 0) {
            System.out.println("Задач нет, начните их добавлять.");
        }
    }
    // метод удаляет задачу из списка
    public static void remove_task(List<String> tasks) {
        System.out.println("Выберите задачу для удаления: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
        if (task_num < 1 || task_num > tasks.size()) { // pf защита от неверного ввода
            System.out.println("Неверный номер задачи для удаления.");
            return;
        } else {
            int n = task_num - 1; // вычисляем индекс удаляемой задачи
            tasks.remove(n); // удаляем задачу с индексом n
        }
    }
    // метод считывает выбор пользователя из меню
    public static int readMenuChoice() {
        Scanner sc = new Scanner(System.in);
        int menu_choice = 0;
        try {
            menu_choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить числа, а не символы");
        }
        return menu_choice;
 */
