import java.util.Scanner;
public class LargestPrompt {

// Prompt user to enter a number and print largest and smallest
import java.util.Scanner;
public class LargestPrompt{
public static void main(String[] args ) {
Scanner input = new Scanner(System.in) ;

int randominput = (int)(Math.random()* 2 );

// initialize occurance to count largest and smallest occurances

int occurance = 0 ;


// initialize i for loop count

int i = 1 ;

while ( i <= 6 ) {
System.out.print("\n Enter number" ) ;
 int userinput = input.nextInt();
if ( userinput > randominput) 
userinput = randominput ;
System.out.print("largest  is "   +   userinput);


else {
System.out.print("largest  is "   +  randominput);


occurance++ ;
System.out.print("largest occurance is  " + occurance++);



if (userinput < randominput )
 userinput = randominput ;
System.out.print("Smallest  is"    +      userinput );

else{
System.out.print("smallest is "    +  randominput) ;

 occurance++ ;
System.out.print("smallest occurance is "   +  occurannce);

int sum = number + number ;
System.out.print("sum is " + sum);
i++  ;
}

}
}