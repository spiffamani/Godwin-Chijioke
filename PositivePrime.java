import java.util.Scanner;
public class PositivePrime {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number ");
int number1 = input.nextInt();

 int divide = (number1 * number1 ) - 1 / 24 ;

if (  divide != 0)
System.out.print( "This is a prime  number");


else if (  divide == 0)
System.out.print( "This is not a prime  number");





 
}
}

