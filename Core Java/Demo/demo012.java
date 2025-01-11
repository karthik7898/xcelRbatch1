import java.util.*;
public class demo012{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the radius of the circle");
        double radius = sc.nextDouble();
        double PI = 3.14;
        double area = PI*radius*radius;
        System.out.println("Area of the circle is:"+area);
        sc.close();

    }
}