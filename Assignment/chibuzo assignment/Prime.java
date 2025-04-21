import java.util.Scanner;
public class Prime {
public static void main(String[] args ){
Scanner input = new Scanner(System.in) ;
System.out.print("Enter prime number ") ;
int number =input.nextInt();

int number1 = number ;
for (int i = 0; i <= 1 ; i++){ 
if (number % 2 == 0 )
System.out.println("prime number "  +  number);
}
}
}