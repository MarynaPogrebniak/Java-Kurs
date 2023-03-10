public class Address extends Employee {
  int postCode;
  String streetAndHouse;

  public Address(String name, String email, int ID_num, int postCode, String streetAndHouse) {
    super(name, email, ID_num);
    this.postCode = postCode;
    this.streetAndHouse = streetAndHouse;
  }

  @Override
  public String toString() {
    return "Address{" +
        "postCode=" + postCode +
        ", streetAndHouse='" + streetAndHouse + '\'' +
        '}';
  }

  public int getPostCode() {
    return postCode;
  }

  public String getStreetAndHouse() {
    return streetAndHouse;
  }

}
