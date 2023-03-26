public class OverloadingReturn {

 public int sum (int i1, int i2) {
   return i1 + i2;
 }

 protected String sum (String s1, String s2){
   return  s1 + s2;
 }
}

class  Overloading2Test {

  public static void main(String[] args) {

    OverloadingReturn mO2 = new OverloadingReturn();
    int a = mO2.sum(5,7);
    System.out.println(a);
    String s = mO2.sum("Privet", " moi drug");
    System.out.println(s);
  }
}