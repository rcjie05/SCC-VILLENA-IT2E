package mainvillena;

import java.util.Scanner;

public class Product {
    
    int pid, stock, sold;
    String name;
    double price;
    int profit, tep;
    Product[] pr = new Product[100];
    
    public void getProduct() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the number of Products: ");
        int num_p = sc.nextInt();
        pr = new Product[num_p];  
        
        for (int i = 0; i < num_p; i++) {
            System.out.println("\nEnter the Details for Product " + (i + 1));
            pr[i] = new Product(); 
            
            System.out.print("ID: ");
            pr[i].pid = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Product Name: ");
            pr[i].name = sc.nextLine();
            
            System.out.print("Price: ");
            pr[i].price = sc.nextDouble();
            
            System.out.print("Stocks: ");
            pr[i].stock = sc.nextInt();
            
            System.out.print("Sold: ");
            pr[i].sold = sc.nextInt();
            sc.nextLine();
            
            pr[i].profit = (int) (pr[i].price * pr[i].sold);  
            pr[i].tep = (int) (pr[i].price * pr[i].stock);    
        }
        
    }
    
    public void viewProduct() {
        double totalProfit = 0, totalTep = 0;
        
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "TEP", "Status");
        
        for (Product product : pr) {
            if (product != null) {
                String status = product.stock > 0 ? "Available" : "Out of Stock";
                System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10d %-10d %-10s\n", 
                        product.pid, product.name, product.price, product.stock, product.sold, 
                        product.profit, product.tep, status);
                totalProfit += product.profit;
                totalTep += product.tep;
            }
        }
        
        System.out.println("\n---------------------------------");
        System.out.printf("Total Profits: %.2f\n", totalProfit);
        System.out.printf("Total Estimate Price: %.2f\n", totalTep);
    }

}