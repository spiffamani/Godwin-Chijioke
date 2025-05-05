import java.util.Scanner;
public class LotteryGame {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int lottery = (int)(Math.random() * 1000 );

System.out.print(" Enter a three digit number e.g 234");
int guess = input.nextInt();
int guess1 = lottery / 10 ;
int guess2 = lottery % 10;

int lottery1 = lottery / 10 ;
int lottery2 = lottery % 10 ;

if ( guess == lottery )
System.out.println("you won  " +" $10000 ");

else if (guess1 == lottery2  &&  guess2 = lottery1)

System.out.println("you won " + "$3000" );

 else if  ( guess1 == lottery1 || guess1 == lottery2 
|| guess2 == lottery1 || guess2 == lottery2 ) 
System.out.println(" you won " + "$1000 ") ;
 else 
System.out.println("you lost");



}
}

