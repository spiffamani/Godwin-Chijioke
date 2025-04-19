import java.util.Scanner; 
public class Assignment224 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number");
double number1 = input.nextDouble();
System.out.print("Enter second number");
double number2 = input.nextDouble();
System.out.print("Enter third number");
double number3 = input.nextDouble();
System.out.print("Enter fourth number");
double number4 = input.nextDouble();
System.out.print("Enter fifth number");
double number5 = input.nextDouble();
double largest = 0 ;
if (number1  > largest) 
largest = number1;
if ( number2 > largest) 
largest = number2;
if (number3 > largest ) 
largest = number3;
if (number4 > largest) 
largest = number4 ; 
if (number5 > largest) 
largest = number5;
 


System.out.printf("this is largest %d%n" , largest);

double smallest = 0 ;

if (number1  < smallest) 
smallest = number1;
if ( number2 < smallest) 
smallest = number2;
if (number3 < smallest ) 
smallest = number3;
if (number4 < smallest)
largest = number4 ; 
if (number5 < smallest); 
smallest = number5 ;

System.out.printf("this is smallest %d%n "    , smallest);

}
}