import java.util.Scanner;
public class TestPush {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

System.out.println(Push.findmultiple(number));
}
}