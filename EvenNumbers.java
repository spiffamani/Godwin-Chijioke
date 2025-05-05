import java.util.Scanner;
public class EvenNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number");
int usernumber = input.nextInt();


//int divider = 2 ;
for(int print = 1 ; print<= usernumber; print++){
if (print % 2 == 0){
 System.out.println(print);
 }
}


}
}