import java.util.Scanner;
public class Assignment234{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter first population" );
double number = input.nextDouble();  
double firstyear= number * (1 + 0.9) ;
System.out.printf("first year population is %d " , firstyear );
double secondyear = number * (1 + 0.9) * (1 + 0.9) ;
System.out.printf("second year population is %d ", secondyear );
double thirdyear = number * (1 + 0.9) * (1 + 0.9) * (1 + 0.9);
System.out.printf("third year population %d " , thirdyear );
double fourthyear = number * (1 + 0.9) *(1 + 0.9) * (1 + 0.9) * (1 + 0.9);
System.out.printf("fourth year population is %d " , fourthyear );
double fifthyear = number * (1 + 0.9) * (1 + 0.9) * (1 + 0.9) * (1 + 0.9) * (1 + 0.9);
System.out.printf(" fifth year population is %d" , fifthyear );
}
}
