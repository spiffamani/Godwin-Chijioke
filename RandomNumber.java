import java.util.Scanner;
public class RandomNumber {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);
int computer = (int)(Math.random() * 10) ;

System.out.print(" pick a number " ) ;
int number1 = input.nextInt();

if ( number1 < 1){
System.out.print(" wrong input start game " );
}
if (number1 > 10 ) {
System.out.print(" wrong input start game ");
}
if ( computer == number1){ 
System.out.print("  Correct " );
if ( computer != number1){
System.out.print(" Not Correct");
}


}

}
}