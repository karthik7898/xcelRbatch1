
import java.util.*;
public class demo014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer:");
        int a = sc.nextInt();
        System.out.println(a+=5);
        System.out.println(a-=5);
        System.out.println(++a);
        System.out.println(--a);
        
        sc.close();
    }
    
}
