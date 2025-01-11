import java.util.*;
public class demo018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min: ");
        int min = sc.nextInt();
        double day = min/(24*60)%365;
        double year = min/(365*24*60);
    System.out.println("No of years for "+min +" is: " + year +" year");
    System.out.println("no.of days " + min +" is "+ day + " day"); 
    sc.close();  
 }
    
}
