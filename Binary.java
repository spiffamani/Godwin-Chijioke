import java.util.Scanner;

public class Binary { 
public static void main(String[] args ){
Scanner input = new Scanner(System.in);
System.out.print( "Enter number ");
int binary = input.nextInt();


int a = binary / 10;
 binary = a % 2; 

int b = binary / 10 ;
 binary = b % 2 ;

//int c = binary / ;
// binary = c % 2;

int d = binary /  2;

System.out.printf("%d%d%d",  a ,  b , d );
}
}
