// indicating wether a number is a prime number

import java.util.Scanner; 
public class PrintNumbers {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

// prompt user for input 

System.out.print("Enter a number ");
int userinput = input.nextInt();
int print = 2;
int count = 3;

for ( print = 2; print <=userinput; print++);
if (userinput % count == 0  )
System.out.print("Number is a prime number");

else if (userinput % print == 0 || userinput % 3 != 0)
System.out.print("Number is not a prime " );



else
System.out.print("Number is  a prime ");
 
 



}
}
