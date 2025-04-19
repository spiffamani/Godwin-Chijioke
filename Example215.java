import java.util.Scanner;
public class Example215 {
public static  void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number ");
int square1 = input.nextInt();
System.out.print(" Enter second number");
int square2 = input.nextInt();
int num1 = square1 * square1 ;
int num2 = square2 * square2;
int square = num1 + num2 ;
System.out.printf(" sum is %d " , square);
int diff = num1 - num2 ;
System.out.printf(" sum is  %d ",  diff);
}
}