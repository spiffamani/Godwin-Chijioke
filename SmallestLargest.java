import java.util.Scanner;
public class SmallestLargest {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print(" Enter first number " );
int number1 = input.nextInt(); 

int even = 0 ;
int average = 0 ;
int divide = 0;

int smallest = number1 ;
int largest = number1 ;

System.out.print( "Enter first number" );
int number1 = input.nextInt();

System.out.print("Enter Second number" );
int number2 = input.nextInt();

System.out.print("Enter third number" );
int number3 = input.nextInt();

System.out.print(" Enter fourth number " );
int number4 = input.nextInt();

System.out.print("Enter fifth number " );
int number5 = input.nextInt();

if (number1 <  number2 &&  number1 <  number3 && number1 < number4 && number1 <  number5 ) ;
if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5 ) ;
System.out.printf( " largest " , number1);
System.out.printf(" smallest " , number1 );
}
}