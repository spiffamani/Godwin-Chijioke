import java.util.Scanner;
public class Assignment225 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter first number ");
int number1 =input.nextInt();
 int number = 3 ;
int sum = number1 % number ;
if ( number1 % sum != 0)
System.out.printf(" this is not Divisible %d " , number1 );

if (number1 % sum == 0 )
System.out.printf(" this is Divisible %d " , number1 );
}
}