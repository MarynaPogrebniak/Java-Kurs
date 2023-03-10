public class Main {

  public static void main(String[] args) {
    System.out.println("Работник и его зарплата");
    //Нужно иметь систему, в которой есть сотрудники, их зп и надо
    //уметь отравлять им письма по имейл с инфо об их зарплате


    //    так создать экземпляр абстрактного класса Employee нельзя
    //    Employee emp1 = new Employee("Ivanov", "ivanov@gmail.com", 23);
    //    emp1.mailPaySlip();

    Salary s1 = new Salary("Ivanov", "ivanov@gmail.com", 23, 60000);
    Salary s2 = new Salary("Petrov", "petrov@gmail.com", 24, 65000);

    System.out.println(s1); //только salary напечатает
    System.out.println(s2);

    s1.mailPaySlip();
    System.out.println();

    s2.mailPaySlip();
    s2.setSalary(78000);
    System.out.println("Новая годовая зп Petrov " + s2.getSalary());
    System.out.println();

    s2.mailPaySlip();

    Adresse empAdresse1 = new Adresse("Sidorov", "sidorov@gmail.com",28,"Deutschland, Nurnberg");
    Adresse empAdresse2 = new Adresse("Demchenko", "demchenko@gmail.com",29,"Deutschland, Wurzburg");

    System.out.println(empAdresse1.getAdresse());
    System.out.println(empAdresse2.getAdresse());
  }

}