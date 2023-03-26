public class Main {

  public static void main(String[] args) {

    Phone firstPhone = new Phone("+49015203212332","Iphone", "13 pro max");
    Phone secondPhone = new Phone("+49015203245678","Samsung", "Galaxy s22");

    System.out.println(firstPhone);
    System.out.println(secondPhone);
   firstPhone.setBrand("kkkk");
    System.out.println(firstPhone.brand);



    /*Phone firstPhone = new Phone();
    firstPhone.phoneNumber = "+49015303061631";
    firstPhone.brand = "Iphone";
    firstPhone.model = "12 Pro Max";

    Phone secondPhone = new Phone();
    secondPhone.phoneNumber = "+4901123456789";
    secondPhone.brand = "Samsung";
    secondPhone.model = "Galaxy S22";

    Phone thirdPhone = new Phone();
    thirdPhone.phoneNumber = "+4976543212347";
    thirdPhone.brand = "LG";
    thirdPhone.model = "A55";

    System.out.println(firstPhone);
    System.out.println(secondPhone);
    System.out.println(thirdPhone);

    firstPhone.receiveCall("Maryna");

    System.out.println("Номер 1 телефона " + firstPhone.getPhoneNumber());
    System.out.println("Номер 2 телефона " + secondPhone.getPhoneNumber());
*/


  }
}