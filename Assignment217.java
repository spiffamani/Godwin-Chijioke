import java.util.Scanner; 
public class Assignment217 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter first number ");
int a = input.nextInt();
System.out.print("Enter second number ");
int b = input.nextInt();

System.out.print("Enter third number ");
int c = input.nextInt();

int sum1 = a + b + c;
System.out.printf("sum is %d%n", sum1);

int product = a * b * c;
System.out.printf(" product is %d%n " , product);


int average = sum1 / 2 ; 
System.out.printf(" average is %d%n ", average);

int largest=  a;



if (a > largest ) {
System.out.printf(" a is > %d%n " , largest );
}


if (a < largest ) {
System.out.printf(" a is < %d%n " , largest );
}

if ( b > largest) {
System.out.printf(" b is  > %d%n" , largest);
}

if ( b < largest) {
System.out.printf(" b is  < %d%n" , largest);
}

if (c > largest){
System.out.printf("c is > %d%n " , largest);
}

if ( c < largest) {
System.out.printf(" b is  < %d%n" , largest);
}

int smallest = a ;


if (a < smallest ) {
System.out.printf(" a is < %d%n " , smallest );
}

if (a > smallest ) {
System.out.printf(" a is > %d%n " , smallest );
}

if (b < smallest ) {
System.out.printf(" b is < %d%n " , smallest );
}

if ( b > smallest) {
System.out.printf(" b is  > %d%n" , smallest);
}

if (c < smallest ) {
System.out.printf(" c is < %d%n " , smallest);
}

if ( c > smallest) {
System.out.printf(" c is  > %d%n" , smallest);
}



}
}