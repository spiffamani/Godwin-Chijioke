import java.util.Scanner;
public class ShippingCost {
public static void main(String[] args) {
Scanner input = new Scanner(System.in) ;
System.out.print("Enter weight");
int number1 = input.nextInt();
// using the value  giving to know package weight
int weight1 = 0 ;
int weight2 = 1 ;
int weight3 = 3 ;
int weight4 = 10 ;
int weight5 = 1 ;
int weight6 = 3 ;
int weight7 = 10 ;
int weight8 = 20 ;



if (weight1 < number1 ){
System.out.printf(" shipping cost %d " , weight1);
}


if ( weight1 <= number1 ){
System.out.printf( "this cannot be shiped %d%n", weight1) ;
}

if ( weight2 < number1 ){
System.out.printf( "this cannot be shiped %d%n", weight2) ;
}

if ( weight2 <= number1 ){
System.out.printf( "this cannot be shiped %d%n", weight2) ;
}

if ( weight3 < number1 ){
System.out.printf( "this cannot be shiped %d%n", weight3) ;
}

if ( weight3 < number1 ){
System.out.printf( "this cannot be shiped %d%n", weight3) ;
}

if ( weight4 < number1 ){
System.out.printf( "this cannot be shiped %d%n", weight4) ;
}

if ( weight4 <= number1 ){
System.out.printf( "this cannot be shiped %d%n", weight4) ;

}

}

}