import java.util.Scanner;
public class Compete {
public static void main( String[] args){
Scanner input = new Scanner(System.in);
System.out.print(" Enter first number");

int number1 = input.nextInt();


int square = number1 * number1;


 if (number1  > 100) {

System.out.printf("%d > %d%n",  number1 ,100 );
}

 if (number1  == 100) {

System.out.printf( "%d == %d%n",  number1 , 100 );

}


if (number1 != 100) {
System.out.printf("%d !>= %d%n",  number1 , 100 );


}

 if(number1  <  100) {
System.out.printf("%d < %d%n",  number1 , 100 );
}

if (square > 100 ) {
System.out.printf("square" +  number1 , 100);
}

if (square == 100 ) {
System.out.printf("square" +  number1 , 100);
}

if (square != 100 ) {
System.out.printf("square" +  number1 , 100);
}

if (square < 100 ) {
System.out.printf("square" +  number1 , 100);
}



}
}