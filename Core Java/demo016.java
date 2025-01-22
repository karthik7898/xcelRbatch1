import java.util.Scanner;

class PalindromeOf3 {
	boolean isPalindromeOf3Digits(int n){
		return (n/ 100) == (n % 10);
	}
}
public class demo016 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a number: ");

        PalindromeOf3 obj = new PalindromeOf3(); 

        int n = sc.nextInt();

		System.out.println(obj.isPalindromeOf3Digits(n));
        sc.close();
	}
}