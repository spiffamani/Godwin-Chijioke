import java.util.Scanner;
public class  LargestAndsmallest {
public static void main( String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number " ) ;
int number1 = input.nextInt();
System.out.print("Enter second  number " ) ;
int number2 =  input.nextInt();
System.out.print("Enter third number  " ) ;
int number3 =  input.nextInt();
System.out.print("Enter fourth number " ) ;
int number4 =  input.nextInt();
System.out.print("Enter fifth  number " ) ;
int number5 =  input.nextInt();

int average = 0 ;
int Even = 0 ;

if ( number2 > number1 )
number1 = number2 ;

if ( number3 > number1 )
number1 = number3 ;

if ( number4 > number1 )
number1 = number4 ;

if ( number5 > number1 )
number1 = number5 ;
System.out.printf(" largest number %d", number1 );

if ( number2 < number1 )
number1 = number2 ;

if ( number3 < number1 )
number1 = number3 ;

if ( number4 < number1 )
number1 = number4 ;

if ( number5 < number1 )
number1 = number5 ;
System.out.printf(" smallest number %d%n", number1 );

average = (number1 + number2 + number3 + number4 + number5)  /  5;
System.out.printf("Average number is %d%n ", average);

Even = (number1 + number1 ) / 2 ;
System.out.printf("Even number is %d%n" , Even);

}
}
