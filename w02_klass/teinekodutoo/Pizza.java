import java.util.ArrayList;

public class Pizza {
  ArrayList<String> toppings = new ArrayList<String>();
  int dough = 0;
  int cookingTemp = 0;

  public void addTopping(String topping)
  {
      this.toppings.add(topping);
  }

  public void addDough(int grams)
  {
      this.dough = grams;
  }

  public void setCookingTemp(int temp)
  {
    this.cookingTemp = temp;
  }

  public void listToppings()
  {
    this.toppings.forEach((topping) -> System.out.println(topping)); 
  }
}