import java.util.Scanner;
public class Palindromes {
public static void main(String[] args){
Scanner input = new Scanner(System.in);


int firstnumber = 0;
int secondnumber = 0;
int thirdnumber = 0;

System.out.print("Enter three digit number");
int userinput = input.nextInt();

firstnumber = userinput / 100 ;
secondnumber = userinput - (firstnumber * 100) /10 ;
thirdnumber = (userinput / 100) % 10;

if (firstnumber == thirdnumber){
 firstnumber = thirdnumber ;
System.out.print(" palindrome number is   " );
}
   
else { 

System.out.println(" this not a palindrome number"       +        userinput);
}
 


}
}