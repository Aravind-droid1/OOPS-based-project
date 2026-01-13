package pizza_shop4;

import java.util.List;
import java.util.Scanner;

public class OrderEdit {
    public OrderEdit(List<Quantity> orders,Scanner sc){
        System.out.println("1.completely delete an order an Pizza \n2.edit the number of pizza");
                int choice=sc.nextInt();
                if(choice==1){
                    deleteAnOrder(orders, sc);
                }
                else{
                    editAnOrder(orders, sc);
                }
    }
    private static void deleteAnOrder(List<Quantity> orders,Scanner sc){
        boolean del=true;
        while(del){
            System.out.println("Choose which order to be deleted");
            showOrders(orders);
            System.out.println("For No Changes Press Any number other that pizza number");
            int toDel=sc.nextInt();
            if(toDel>0 && toDel<=orders.size()){
                orders.remove(toDel-1);
                if(orders.isEmpty()) {
                    System.out.println("No more items to delete.");
                    break;
                }
            }
            else{
                System.out.println("returning to order screen");
                del=false;
            }
        }
    }
    private static void editAnOrder(List<Quantity> orders,Scanner sc){
        boolean edit=true;
        while(edit){
            System.out.println("Choose which order to be edited");
            showOrders(orders);
            System.out.println("For No Changes Press Any number other that pizza number");
            int toEdit=sc.nextInt();
            if(toEdit>0 && toEdit<=orders.size()){
                System.out.println("Set the number of pizza");
                int number=sc.nextInt();
                orders.get(toEdit-1).setQuantity(number);
            }
            else{
                System.out.println("returning to order screen");
                edit=false;
            }
        }
    }
    private static void showOrders(List<Quantity> orders){
        int j=0;
        for(Quantity i : orders){
            j++;
            System.out.println(j+". "+(i.getQuantity())
                            +"X"+(i.getIsVeg()?"Veg":"Non Veg")
                            +"-"+(i.getSize())
                            +(i.getCheese()?"+Extra Cheese":"")
                            +(i.getToppings()?"+Extra Toppings":"")
                            +(" = ₹"+i.getQuantity()*i.getPrice()));
                }
    }
}
