package mainvillena;



import java.util.Scanner;

public class MainVillena {


   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Grade gr = new Grade();
        Sale sl = new Sale();
        Product pr = new Product();
        Account ac = new Account();

        int option;
        String response;

        do {
            System.out.println("");
            System.out.println("1. Grade"
                    + "\n2. Sale"
                    + "\n3. Product"
                    + "\n4. Account");

            System.out.print("\nEnter Your Option: ");
            option = sc.nextInt();
            sc.nextLine(); 


            switch (option) {
                case 1:
                    gr.getGrade();
                    gr.viewGrade();
                    break;

                case 2:
                    sl.getSale();
                    break;

                case 3:
                    pr.getProduct();
                    pr.viewProduct();
                    break;

                case 4:
                    ac.getAccounts();
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }

            System.out.print("\nMake another transaction? yes/no: ");
            response = sc.nextLine().toLowerCase();

        } while (response.equals("yes"));

        sc.close();  
    }
}