package pizza_shop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Quantity> list=new ArrayList<>();
        boolean order=false;
    
        System.out.println("Welcome to the pizza shop");
        System.out.println("Would you like to order Pizza (y/n)");
        order=sc.next().equalsIgnoreCase("y");
        while(order){
            Quantity newOrder=new Quantity(sc);
            boolean check=false;
            if(!list.isEmpty()){
                for(int i=0;i<list.size();i++){
                    check=list.get(i).compare(newOrder);
                    if(check){
                        break;
                    }
                }
            }
            if(!check){
                list.add(newOrder);
            }

            System.out.println("Would you like to edit your order (y,n)");
            if(sc.next().equalsIgnoreCase("y")){
                new OrderEdit(list, sc);
            }
            System.out.println("Do u want to order more Pizza (y/n)");
            order=sc.next().equalsIgnoreCase("y");
        }

        if(!list.isEmpty()){
            System.out.println("Please choose(1-Take Away or 2-Dine-In)");
            int takeAway=sc.nextInt();
            new Bill(list,takeAway);
        }
        else{
            System.out.println("Bought Nothing to bill");
        }
        
        System.out.println("Have a nice day,Bye.");
        sc.close();
    }
}