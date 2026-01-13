package pizza_shop4;
import java.util.*;
public class Bill {
    private int total;
    public Bill(List<Quantity> orders,int takeAway){
        int x=1;

        System.out.println("=========================BILL================================");
        for(Quantity i:orders){
            System.out.print(x+". ");
            System.out.print(i.getQuantity()+"X");
            System.out.print(i.getIsVeg()?"Veg     -":"Non-Veg - ");
            System.out.print(i.getSize()+" ");
            System.out.print(i.getCheese()?"+ Cheese ":"");
            System.out.print(i.getToppings()?"+ Toppings  ":"");
            System.out.print(takeAway==1? "Take Away":"Dine In");
            int unitPrice=takeAway==1?(i.getPrice()+20)*i.getQuantity():i.getPrice();
            System.out.print(" - "+unitPrice);
            System.out.println();
            total+=unitPrice;
            x++;
        }
        System.out.println("       Total:       "+total);
        System.out.println("=============================================================");
    }
}
