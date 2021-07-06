public class DeluxeBurger implements Burger{

  String chips;
  String drink;
  Double totalPrice;


  @Override
  public double price() {
    return 8.00;
  }

  @Override
  public String burger(String rollType, String meatType) {
    return this.burger(rollType, meatType);
  }

  @Override
  public String toppings(String chips, String drink, String additionThree, String additionFour) {
    this.chips = chips;
    this.drink = drink;

    return (chips + " " + drink);
  }

}
