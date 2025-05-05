import java.util.Scanner;
public class Test03 {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
int sum = 0;
do {
System.out.println("Enter an integer " +
 "(the input ends if it is 0)");
int number = input.nextInt();
}while (number != 0) ;
 sum += number;
 System.out.println("Enter an integer " +
 "(the input ends if it is 0)");
int number = input.nextInt();



}
}