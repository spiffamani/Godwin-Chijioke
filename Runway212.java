import java.util.Scanner;
public class Runway212 { 
public static void main(String[] args){
Scanner input = new Scanner(System.in) ;
System.out.print( " enter acceleration:  ");
double acceleration = input.nextDouble();
System.out.print(" Enter takeoff:  ");
double takeoff  = input.nextDouble();
double runway1 = (takeoff  * takeoff);
double runway2 = (2 * acceleration )   ;
double result = runway1 / runway2;
System.out.printf (" sum is %f" , result );

}
} 

 