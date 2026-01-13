package pizza_shop4;

public class SuperPizza extends Pizza{
    public SuperPizza(String pizza_size,boolean isVeg,int no_pizza){
        super(pizza_size,isVeg,no_pizza);
        super.extra_Topping(true);
        super.extra_Cheese(true);
    }
}