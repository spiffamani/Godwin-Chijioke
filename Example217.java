import java.util.Scanner;
public class Example217 {
public static void main(String[] args ){
Scanner input = new Scanner(System.in);
System.out.print("Enter first number " );
int num1 = input.nextInt();
System.out.print("Enter second number " );
int num2 = input.nextInt();
System.out.print("Enter third number " );
int num3 = input.nextInt();
int sum = num1 + num2 +  num3 ;
System.out.printf( " sum is %d " , sum );
int average1 = (num1 + num2 +  num3)  ;
int average2 = average1  / 2 ; 
System.out.printf( " average is %d " , average2);
int product = (num1 * num2 * num3) ;
System.out.printf( " product is %d " , product );
if (num1 > num2 ) {
System.out.printf(" %d > %d%n " , num1 , num2);
}
if (num1 > num3 ) {
System.out.printf(" %d > %d%n " , num1 , num3);
}
if (num2 > num1 ) {
System.out.printf(" %d > %d%n " , num2 , num1);
}
if (num2 > num3 ) {
System.out.printf(" %d > %d%n " , num2 , num3);
}
if (num3 > num1 ) {
System.out.printf(" %d > %d%n " , num3 , num1);
}

if (num3 > num2 ) {
System.out.printf(" %d > %d%n ", num3 , num2 );
}

if (num1 < num2 ) {
System.out.printf(" %d < %d%n " , num1 , num2);
}
if (num1 < num3 ) {
System.out.printf(" %d < %d%n " , num1 , num3);
}
if (num2 < num1 ) {
System.out.printf(" %d < %d%n " , num2 , num1);
}
if (num2 < num3 ) {
System.out.printf(" %d < %d%n " , num2 , num3);
}
if (num3 < num1 ) {
System.out.printf(" %d < %d%n " , num3 , num1);
}
if (num3 < num2 ) {
System.out.printf(" %d < %d%n " , num3 , num2);
}

}

}
