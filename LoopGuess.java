import java.util.Scanner ;
public class LoopGuess {
public static void main(String[] args){ 
Scanner input = new Scanner(System.in);
int number = (int)(Math.random() * 100);
System.out.print( "guess computer number ?");
int number1 = input.nextInt();

while(number1 != number ) {
System.out.print("wrong guess . Try again  ?");
number1 = input.nextInt();
}
System.out.println("you got it ! " );
}
}