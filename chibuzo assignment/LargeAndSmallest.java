// Prompt user to enter a number and print largest and smallest;

import java.util.Scanner;
public class LargeAndSmallest {

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

if ( userinput > randominput){
 
userinput = randominput ;
System.out.println("largest  is "   +   userinput);
}
else {  
System.out.println("largest  is "   +  randominput);

occurance++ ;
System.out.println("largest occurance is  " + occurance++);


if (userinput < randominput ){
 userinput = randominput ;
System.out.println("largest  is "   +   userinput);
}
else {
System.out.println("smallest is "    +  randominput) ;


 occurance++ ;
System.out.println("smallest occurance is "   +  occurance++);

int sum = userinput + randominput ;
System.out.println("sum is " + sum);
i++  ;

}
}

}

}
}