package pizza_shop;
import java.util.*;
public class Pizza {
    private String pizza_size;
    private int price;
    private boolean isVeg;
    private int no_pizza;
    List<Object> values=new ArrayList<>();

    private boolean toppings;
    private boolean cheese;

    public Pizza(String pizza_size,boolean isVeg,int no_pizza){
        this.pizza_size=pizza_size.toLowerCase();
        this.isVeg=isVeg;
        this.no_pizza=no_pizza;
        if(this.isVeg){
            switch(this.pizza_size){
                case "small":price=100;break;
                case "medium":price=200;break;
                case "large":price=300;break;
            }
        }
        else{
            switch(this.pizza_size){
                case "small":price=150;break;
                case "medium":price=250;break;
                case "large":price=350;break;
            }
        }
    }

    public void extra_Topping(boolean toppings){
        if(toppings){
            price+=50;
        }
        this.toppings=toppings;
    }

    public void extra_Cheese(boolean cheese){
        if(cheese){
            price+=100;
        }
        this.cheese=cheese;
    }

    public int getQauntity() {return this.no_pizza;}
    public boolean getIsVeg() {return this.isVeg;}
    public String getSize() {return this.pizza_size;}
    public boolean getCheese() {return this.cheese;}
    public boolean getToppings() {return this.toppings;}
    public int getPrice() {return this.price;}

    public void setQuantity(int numberOfPizza){
        this.no_pizza=numberOfPizza;
    }
}
