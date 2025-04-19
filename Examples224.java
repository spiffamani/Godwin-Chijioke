import java.util.Scanner;
public class Examples224 {
public static void main( String[] args ) {
Scanner input = new Scanner(System.in);
System.out.print( "Enter a number");
int number = input.nextInt();
int number1 = (number / 10000) % 10 ;
int number2 = (number / 1000) % 10 ;

int number3 = ( number / 100) % 10 ;

int number4 = (number / 10) % 10 ;

int number5 = number % 10;
System.out.printf("%d " ,   number1);
System.out.printf("%d " ,   number2);
System.out.printf("%d " ,   number3);
System.out.printf("%d " ,   number4);
System.out.printf("%d " ,   number5);
}
}