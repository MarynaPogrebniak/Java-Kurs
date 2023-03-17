// Допишите программу из классной работы (см. файлы Account.java и MainAccounts.java).
//
// Необходимо создать собственное исключение InvalidEmail.
//
// При попытке создать Account нужно выбрасывать собственное исключение,
// если в переданном адресе электронной почты нет символа '@'.
public class InvalidEmail extends IllegalArgumentException {

  public InvalidEmail(String email) {
    super("В e-mail должен быть значок @: " + email);
  }
}