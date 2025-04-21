import java.util.Scanner;
public class LargestPrompt {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in) ;
int number2 = (int)(Math.random()* 2 );

int i = 1 ;
while ( i <= 3 ) {
System.out.print("\n Enter number" ) ;
 int number = input.nextInt();
if ( number > number2) 
number2 = number ;
System.out.print(" Largest is " + number );
int largest = input.nextInt() ;

if (number < number2 ) 
 number = number2 ;
System.out.print("Smallest is"    +      number );
int smallest = input.nextInt();

int sum = number + number ;
System.out.print("sum is " + sum);
i++  ;
}

}
}