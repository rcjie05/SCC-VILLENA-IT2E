package mainvillena;

public class Products {
    
    int id, sold, stock;
    double price;
    String name;
   
    
    public void addProduct(int prid, String prname, double prprice, int prsold, int prstock) {
        this.id = prid;
        this.name = prname;
        this.price = prprice;
        this.sold = prsold;
        this.stock = prstock;
    }
    
    public void viewProduct(){
        
        double profit = this.sold * this.price;
        String status = (this.sold < 1) ? "Out of stock": "Available";
        double tep = this.stock * this.price;
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10s %-10.2f\n",
                this.id, this.name, this.price, this.sold, this.stock, profit, status, tep);
    }

}