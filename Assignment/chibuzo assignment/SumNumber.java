import java.util.Scanner;
public class SumNumber {
public static void main(String[] args ){
Scanner input = new Scanner(System.in) ;
int sum = 0 ;
int plus = 0;


do {
System.out.print("Enter a number ") ;
sum = input.nextInt() ;
System.out.print("Enter a number" );
plus = input.nextInt();
}
 while(sum <= 3  && plus <= 3) ;

if ( sum != 100)
if( plus != 100) 
System.out.println(" play again");

int sum1 = sum + plus ;
System.out.print("sum"    +    sum1);

sum++ ;
plus++;

         
      

    }
}