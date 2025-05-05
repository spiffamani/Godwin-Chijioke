import java.util.Scanner;
public class RaisePower {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in) ;

int i = 0;
int counter = 1;

while (i <= 3)
counter = 1 * counter ;
System.out.print("Enter first number " );
int number1 = input.nextInt();
System.out.print("Enter Second number ") ;
int number2 = input.nextInt();


number1 =(int)( Math.pow(number1, number2)) ;


System.out.print(number1);

}
}