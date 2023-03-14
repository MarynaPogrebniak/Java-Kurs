public class Food {

  private String nameFood;
  int calories;

  public Food(String nameFood, int calories) {
    this.nameFood = nameFood;
    this.calories = calories;
  }

  public String getNameFood() {
    return nameFood;
  }

  public int getCalories() {
    return calories;
  }

  public void setNameFood(String nameFood) {
    this.nameFood = nameFood;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public void eatFood () {
    System.out.println("Давай поешь!");
  }


}
