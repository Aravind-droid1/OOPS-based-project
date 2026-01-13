package pizza_shop;

import java.util.*;

public class Quantity {
    private boolean check;
    private Pizza pizza;
    public Quantity(Scanner sc){
    
        System.out.println("Choose Number 1 or 2 for Pizza type( 1-Super Pizza , 2-Pizza )");
        int type=sc.nextInt();
        System.out.println("Veg or Non-Veg? (1-veg , 2-non-veg)");
        boolean isVeg=sc.nextInt()==1;
        System.out.println("Choose the size of Pizza( small , medium , large) ");
        String size=sc.next();
        System.out.println("Number of Pizza would you like");
        int no_pizza=sc.nextInt();

        if(type==2){
            pizza=new Pizza(size,isVeg,no_pizza);

            System.out.println("Extra Toppings(y/n)");
            pizza.extra_Topping(sc.next().equalsIgnoreCase("y"));
            System.out.println("Extra Cheese(y/n)");
            pizza.extra_Cheese(sc.next().equalsIgnoreCase("y"));
        }
        else{
            pizza=new SuperPizza(size,isVeg,no_pizza);
        }
    }
    public boolean compare(Quantity other){
        this.check= this.getIsVeg()==other.getIsVeg() &&
            this.getSize().equals(other.getSize()) &&
            this.getCheese()==other.getCheese() &&
            this.getToppings()==other.getToppings();
        if(check){
            this.setQuantity(other.getQuantity()+this.getQuantity());
        }
        return check;
    }

    public int getQuantity() {return pizza.getQauntity();}
    public boolean getIsVeg() {return pizza.getIsVeg();}
    public String getSize() {return pizza.getSize();}
    public boolean getCheese() {return pizza.getCheese();}
    public boolean getToppings() {return pizza.getToppings();}
    public int getPrice() {return pizza.getPrice();}

    public void setQuantity(int change){
        pizza.setQuantity(change);
    }
    
}
