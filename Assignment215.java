import java.util.Scanner;
public class Assignment215 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
System.out.print("Enter first number");
int number1 = input.nextInt();
System.out.print("Enter second number");
int number2 = input.nextInt();
int square = number1 * number1 ; 

System.out.printf(" square " + number1 , number2);

int diff = number1 * number1 - number2 * number2 ;
System.out.printf(" diff is %d%n " , diff);

int sum = number1 * number1 + number2 * number2 ;
System.out.printf (" sum  + %d%n " , sum );

}

}