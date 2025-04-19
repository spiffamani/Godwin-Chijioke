import java.util.Scanner;
public class largestSmallest01 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print( "Enter first number" );
int number1 = input.nextInt();

System.out.print("Enter Second number" );
int number2 = input.nextInt();

System.out.print("Enter third number" );
int number3 = input.nextInt();

System.out.print(" Enter fourth number " );
int number4 = input.nextInt();

System.out.print("Enter fifth number " );
int number5 = input.nextInt();

int largestsmallest = 0 ;
int Even = 2 ;

if (number1 > largestsmallest ){
System.out.printf(" this is largest %d%n" , number1);
}

if (number2 > largestsmallest ){
System.out.printf(" this is largest %d%n" , number2);
}

if (number3 > largestsmallest ){
System.out.printf(" this is largest %d%n" , number3);
}

if (number4 > largestsmallest ){
System.out.printf(" this is largest %d%n" , number4);
}

if (number5 > largestsmallest ){
System.out.printf(" this is largest %d%n" , number5);
}

if (number1 < largestsmallest ){
System.out.printf(" this is smallest %d%n" , number1);
}

if (number2 < largestsmallest){
System.out.printf(" this is smallest %d%n" , number2);
}

if (number3 < largestsmallest ){
System.out.printf(" this is smallest %d%n" , number3);
}

if (number4 < largestsmallest ){
System.out.printf(" this is smallest %d%n" , number4);
}

if (number5 < largestsmallest ){
System.out.printf(" this is smallest %d%n" , number5);

}



 if (number1 / Even){
 System.out.println("this is Even ");
 }
 else {
System.out.print();
 }

 if (number2 / Even){
 System.out.println("this is Even ");
 }
 else {
 System.out.print();
 }
 if (number3 / Even){
 System.out.println("this is Even ");
 }
 else {
 System.out.print();
 }
 if (number4 / Even){
 System.out.println("this is Even ");
 }
 else {
 System.out.print();
 }
 if (number5 / Even){
 System.out.println("this is Even ");
}
else {
System.out.print();
 }




int average1 = (number1 + number2 + number3 + number4 + number5);

int average = average1  /  5 ;
System.out.printf(" this is average %d%n " , average );

}

}
