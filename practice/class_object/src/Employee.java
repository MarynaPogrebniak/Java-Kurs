public class Employee {
int id;
String surname;
int age;
double salary;
String department;

  public Employee(int id, String surname, int age, double salary, String department) {
    this.id = id;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
    this.department = department;
  }

  double salaryTwice () {
  salary = salary*2;
  return salary;
}
}
class EmployeeTest {

  public static void main(String[] args) {
    Employee firstEmployee = new Employee(27, "Ivanov", 28, 2500, "IT");

    firstEmployee.salaryTwice();
    System.out.println("Новая зп " + firstEmployee.surname + " " + firstEmployee.salary);

    Employee secondEmployee = new Employee(33, "Pogrebniak", 33, 4765.2, "FullStack");
    secondEmployee.salaryTwice();
    System.out.println("Новая зп " + secondEmployee.surname + " " + secondEmployee.salary);
  }

}
