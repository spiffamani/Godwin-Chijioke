import java.util.Scanner;
public class Application {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
System.out.print("Enter first number");
int number1 = input.nextInt();
System.out.print("Enter second number");
int number2 = input.nextInt();
int square = number1 * number1 ; 

System.out.printf(" square " + number1 , number2);

int result = number1 * number1 - number2 * number2 ;
System.out.printf(" sum is %d%n " , result);

int sum = number1 * number1 + number2 * number2 ;
System.out.printf (" sum  + %d%n " , sum );

}

}