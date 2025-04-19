import java.util.Scanner;
public class LoopAddition {
public static void main(String[] args ) {
Scanner input = new Scanner(System.in);
int number1 = (int)(Math.random() * 10) ;
int number2 = (int)(Math.random() * 10 );


System.out.print( " what is  " + number1 + " + " 
+ number2 + "?");
int answer =input.nextInt();

while (number1 + number2 != answer) {
System.out.print(" wrong answer. Try again . what is " 
+ number1 + "+" + number2 + "?" );
answer  = input.nextInt();

}

System.out.print(" you got it " )  ;
}
}
