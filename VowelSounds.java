import java.util.Scanner;
public class VowelSounds{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
System.out.print( "Enter number");

int users = scanner.nextInt();

 int divider = users * users ;

int checker = divider * users / 10 ;
users = checker % 10 ;
System.out.print(users); 

}
} 