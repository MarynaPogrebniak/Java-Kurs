public class BankCard implements Credit, Debit{

  @Override
  public void debitMethod() {
    System.out.println("Deduct some money from card account");
  }

  @Override
  public void creditMethod() {
    System.out.println("Add some money to card account");
  }
}
