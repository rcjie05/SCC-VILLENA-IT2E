package mainvillena;
import java.util.Scanner;


public class Grade {
   
    Grades[] grs = new Grades[100];
    
        int id, snum;
        String name;
        double pre, mid, prefi, fin;
  
public void getGrade(){
        Scanner x = new Scanner(System.in);
        
            System.out.print("\nEnter no. of Students: ");
            snum = x.nextInt();
            
            for(int i = 0; i < snum; i++){
                System.out.println("\nEnter details of Student " +(i+1));
                
                System.out.print("ID: ");
                id = x.nextInt();
                
                System.out.print("Name: ");
                name = x.nextLine();
                x.nextLine();
                
                System.out.print("P: ");
                pre = x.nextDouble();
                
                System.out.print("M: ");
                mid = x.nextDouble();
                
                System.out.print("PF: ");
                prefi =x.nextDouble();
                
                System.out.print("F: ");
                fin = x.nextDouble();
                
                grs[i] = new Grades();
                grs[i].addGrades(id, name, pre, mid, prefi, fin);
                
                System.out.println("");
                
            }
            
}
    
            double tca = 0; 
            int passed = 0;
            int failed = 0;
           
  public void viewGrade(){
      
            for(int i = 0; i < snum; i++){
                
                grs[i].ave = (grs[i].sprelim + grs[i].smidterm + grs[i].sprefi + grs[i].sfinals) / 4;
                tca += grs[i].ave;
                
                grs[i].viewGrades();
                
                if(grs[i].ave < 3.0){
                    passed++;
                } else{
                    failed++;
                }
            }
            System.out.println("\n------------------------------------------------------------------------------");
            System.out.println("No. of Students: " + snum);
            System.out.println("Total Class Average: " + tca / snum);
            System.out.println("Number of passed: "+passed);
            System.out.println("Number of failed: "+failed);
        }
  
    }
  