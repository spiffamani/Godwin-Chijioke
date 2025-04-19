import java.util.Scanner;
public class NewAssignment04 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number");
int number1 = input.nextInt();
System.out.print("Enter second number");
int number2 = input.nextInt();
int maxmin = 0 ;
int sum  = number1 + number2 ;
System.out.printf("sum of two integers %d%n" , sum );
int product = number1 * number2 ;
System.out.printf("product of two integers %d%n" , product);
int divider = 2 ;
int average = ( number1 + number2 ) / divider ;
System.out.printf("average of two integers %d%n", average);
int distance = number1 - number2 ;
System.out.printf("  distance of two integers %d%n" ,distance);
 
if ( number1 > number2) {
System.out.printf(" max integer %d%n" , number1 );
}
else {

System.out.printf("max integer %d%n" , number2);

}
if (number1 < number2 ){
System.out.printf("min integer %d%n " , number1);
}
else {
System.out.printf(" min integer %d%n " , number2 );
}






}
}