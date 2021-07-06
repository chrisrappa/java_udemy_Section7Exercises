import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthyBurger implements Burger{

  public double totalPrice;
  String additionFive;
  String additionSix;

  ArrayList<String> additions = new ArrayList<>();

  @Override
  public double price() {

    for(String addition : additions){
      totalPrice += 1;
    }
    return totalPrice;
  }


  @Override
  public String burger(String rollType, String meatType) {
    totalPrice += 6.00;
    return this.burger(rollType, meatType);
  }

  @Override
  public String toppings(String additionOne,
                          String additionTwo,
                          String additionThree,
                          String additionFour) {

    additions.add(additionOne);
    additions.add(additionTwo);
    additions.add(additionThree);
    additions.add(additionFour);

    return this.toppings(additionOne, additionTwo, additionThree, additionFour);

  }

  public String healthyAdditions(String additionFive, String additionSix){

    this.additionFive = additionFive;
    this.additionSix = additionSix;
    additions.add(additionFive);
    additions.add(additionSix);

    return this.healthyAdditions(additionFive, additionSix);

  }

}
