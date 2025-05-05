
// Prompt user to enter a number and print largest and smallest;

import java.util.Scanner;
public class LargeAndSmall {

public static void main(String[] args ) {
Scanner input = new Scanner(System.in) ;


// initialize occurance to count largest and smallest occurances



int count = 0 ;
int occurance = 0 ;


while (count <=5 ){
count++  ;

System.out.print("Enter a number");
int largest = input.nextInt();

System.out.print("Enter aa number");
int smallest = input.nextInt();


if( smallest == largest){
largest = smallest;
occurance++ ;
}
//else if(smallest > largest ){
//largest = smallest;
//occurance+=1;
//}
else if(smallest < largest ){
largest = smallest;
occurance+=1;

}
if( largest == smallest){
smallest = largest;
occurance++;
}
else if(largest > smallest){
smallest = largest;
occurance+=1;
}

//else if(largest < smallest ){
//smallest = largest;
//occurance+=1;
//}

System.out.println("largest number is " +  largest );
System.out.println("smallest number is "  +  smallest );

System.out.println("Number of occurance is "   +   occurance );


}

}
}