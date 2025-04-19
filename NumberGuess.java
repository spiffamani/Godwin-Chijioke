import java.util.Scanner;
public class NumberGuess {
public static void main(String[] args ){
Scanner input = new Scanner(System.in);
int number1 = (int)(Math.random() * 10)+ 1;
int count = 1;

System.out.println(" guess a number between 0 to 10 ");

System.out.print("pick a number " );
int number2 = input.nextInt();

while (count < 3) {





if (number2 < number1 ){
System.out.println(" wrong input. try again " + number1);
number2 = input.nextInt();

}
else  if (number1 > number2 ){
System.out.print(" Wrong input . try again " + number1);
number2 = input.nextInt();

}
if (number2 == number1){
System.out.print(" you are correct " + number1 );

}



count++;



}



}


}
