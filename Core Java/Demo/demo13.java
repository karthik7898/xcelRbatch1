import java.util.*;
public class demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double Base = sc.nextDouble();
        System.out.print("Enter the Height of triangle: ");
        double Height = sc.nextDouble();
        double area = 0.5*Base*Height;
        System.out.println("Area of triangle is: "+area);
        sc.close();  
        
    }
    
    
}
