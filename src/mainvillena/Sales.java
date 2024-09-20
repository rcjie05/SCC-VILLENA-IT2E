package mainvillena;

public class Sales {
        String coname, prname;
        int quant,pcash;
        double ppri;
        
        public void addSales(String cosna,String proname, int qty, double pri, int csh, double ttdue, double chnge ){
            
            this.coname = cosna;
            this.prname = proname;
            this.quant = qty;
            this.ppri = pri;
            this.pcash = csh;
            
        }  
            
        public void viewSales(){
             double totd = quant * ppri;
             double change = pcash - totd;
             
             System.out.printf("%-10s %-10s %-10d %-10.2f %-10d %-10.2f %-10.2f",
                     this.coname, this.prname, this.quant, this.ppri, this.pcash, totd, change);
             System.out.println("");
         }
            
}
