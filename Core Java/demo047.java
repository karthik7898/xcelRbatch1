
import java.util.Scanner;

public class demo047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int count =0;
        int number = sc.nextInt();
        String stringnum = String.valueOf(number);
        for(int i = 0;i<=stringnum.length()-1;i++){
            count++;
        }
        System.out.println("Number of digits of a "+number+"is :"+count);
    }
}