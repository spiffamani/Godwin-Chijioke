import java.util.Scanner;
public class Palindrome {
public static void main(String[] args){
Scanner input = new Scanner(System.in);


int firstnumber = 0;
int secondnumber = 0;
int thirdnumber = 0;

System.out.print("Enter number");
int userinput = input.nextInt();

firstnumber = userinput / 100 ;
secondnumber = userinput - (firstnumber * 100) /10 ;
thirdnumber = firstnumber * 100 % 10 ;

if (firstnumber == thirdnumber){
System.out.print("Number is palindrome");
}
else {
System.out.println(" Number is not palindrome");
 }


}
}