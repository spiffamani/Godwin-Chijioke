import java.util.Scanner;
public class Examples230 {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter first number ");
int a = input.nextInt();
int b = 0;
int c = 0;
int d = 0;
int e = 0;
int f = 0;

if ( a >= 10000)
if (a <= 99999)

b = a /  10000 ;
System.out.printf("%d" , b);
a = a / 1000 ;
c = a / 1000;
System.out.printf("%d" , c );


}
}