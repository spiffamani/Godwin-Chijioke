import java.util.Scanner;
public class NewAssignment06 {
public static void main( String[] args ){
Scanner input = new Scanner(System.in);
System.out.print("Enter first number" );
int number1 = input.nextInt();

System.out.print( "Enter Second number " );
int number2 = input.nextInt();
int  largest = 0 ;
int equals =  number1 =  number2;   
int smallest1 = 6;
int smallest = equals / smallest1 ;

if (number1 > largest){
System.out.printf( "the largest number %d " , number1);
}
else {
System.out.printf("%d" , largest );
}

if (number2 < largest){
System.out.printf( "the largest number %d " , number2);
}
else {
System.out.printf("%d%n" , largest );
}

if (number1 == number2 );
System.out.printf(" the same value %d%n" , largest );
if (  smallest > number1 && smallest > number2) {
System.out.printf("not the same remainder %d%n" ,  number1 + number2);
}
else {
System.out.printf(" the same remainder %d%n " , smallest );
}


}
}

