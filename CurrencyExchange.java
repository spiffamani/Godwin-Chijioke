import java.util.Scanner;
public class CurrencyExchange {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter exchange rate ");
double exchange = input.nextDouble();

double dollars = 0 ;
double conversion = exchange * 100 ;

double rmbamount = 1 ;
double amount = rmbamount * conversion ;
 
if ( exchange > dollars ) {
System.out.printf(" dollar amount %f " , conversion );
}
else {
System.out.printf("%f" , dollars);
}

if (exchange < conversion ) { 
System.out.printf(" %f rmb amount ", amount );
}

else {
System.out.printf( "%f", amount);

}

}
}