import java.util.Scanner;
public class Example {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number" );
int x = input.nextInt();
System.out.print(" Enter second number" );
int y  = input.nextInt();

int result = x - y;
System.out.printf(" product is %d%n " , result );
}
}