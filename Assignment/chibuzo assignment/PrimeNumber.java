import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);

int number1;
int number2;
int sum = 0 ;
int i = 1 ;
do {

System.out.print(" \n  Enter first number " ) ;
 number1 = input.nextInt();
System.out.print(" Enter Second number ") ;
 number2 = input.nextInt();

 sum = number1 + number2 ;
System.out.print("sum is "   +   sum ) ;
i++;
}
while (i <= 2 );

System.out.print("  \n would you like to play more " );


  



}



}