// calculation of loan amount over the years ;
import java.util.Scanner;
public class LoanAmount {
public static void main(String[] args ) { 
Scanner input = new Scanner(System.in) ;

System.out.print("Enter annual interest rate " );
double annualrate = input.nextDouble();

System.out.print("Enter number of years" );
double numberofyears = input.nextDouble();

System.out.print("Enter loan amount " );
double loanamount = input.nextDouble();

double monthlyinterestrate = annualrate / 1200 ;

double monthlypayment = loanamount * monthlyinterestrate / (1 
- 1 / Math.pow (1+monthlyinterestrate , numberofyears * 12)) ;

double totalpayment = monthlypayment * numberofyears * 12 ;


System.out.println(" monthly payment " + monthlypayment );
System.out.println(" total payment " + totalpayment );

}
}




