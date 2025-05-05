import java.util.Scanner;
public class positiveclass {
public static void main(String[] args){
Scanner input = new Scanner(System.in);


double userinput;
double positive = 0;
double negative = 0 ;
double average;
double sum = 0 ;
double total = 0; 
while (true){
System.out.print("Enter number");
 userinput = input.nextDouble();

if( userinput == 0){
break;

}
++total;
sum = sum + userinput;
	if (userinput > 0 ) {
     System.out.println("This is positive number "   +     userinput);
        ++positive ;

 
}     
	else if (userinput < 0) { 
 		 System.out.print("this is a negative "    +    userinput);
			 ++negative; }
}



 average = sum / total ;
System.out.println( "average number is"     +      average);




}
}

