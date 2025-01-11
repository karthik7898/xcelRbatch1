import java.util.*;

public class demo021{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
     System.out.print("Enter monthly gross salary: Rs ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Enter monthly HRA: Rs ");
        double monthlyHRA = sc.nextDouble();

        System.out.print("Enter monthly PF: Rs ");
        double monthlyPF = sc.nextDouble();

        double annualSalary = monthlySalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;

        double deductions = annualHRA + annualPF;
        double taxableIncome = annualSalary - deductions;

        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        
        double tax = 0;
        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20);
        } else {
            tax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30);
        }

        System.out.println("Annual Income Tax: Rs " + tax);

        sc.close();
    }
}
