
package mainvillena;

import java.util.Scanner;

public class Sale {
        
    public void getSale(){
        Scanner input = new Scanner(System.in);
        
        String cname, pname;
        int qty;
        double price, cash, tdue, change;
        
        System.out.print("\nEnter Customer Name: ");
        cname = input.nextLine();
        
        System.out.print("Enter Product Name: ");
        pname = input.nextLine();
        
        System.out.print("Enter Quantity: ");
        qty = input.nextInt();
        
        System.out.print("Enter Price: ");
        price = input.nextInt();
        
        
        tdue = price*qty;
          
        do{
        System.out.print("Enter Cash: ");
        cash = input.nextInt();
        
            if(tdue > cash){
                System.out.println("Insufficient Cash\n");
            }
        }while(tdue > cash);
        
        
        System.out.println("");
        
        
            System.out.println("--------------------------------------------");
            System.out.println("                   RECEIPT                  ");
            System.out.println("--------------------------------------------");

            System.out.println("Name: "+cname);

            System.out.println("Item Name: "+pname);
            System.out.println("Quantity: "+qty);

            System.out.println("--------------------------------------------");

            System.out.println("Total Due: " +tdue);
            System.out.println("Cash: " +cash);

            System.out.println("--------------------------------------------");

            change= cash - tdue;
            System.out.println("Change: " +change);
    }
    
    
}