
    import java.util.Scanner;

    public class demo048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int sum = 0;
        int number = sc.nextInt();
        String stringnum = String.valueOf(number);
        for(int i = 0;i<=stringnum.length()-1;i++){
            sum+=stringnum.charAt(i)-'0';
        }
        System.out.println("Sum of digits of a "+number+" is : "+sum);
        sc.close();
    }
}
    
