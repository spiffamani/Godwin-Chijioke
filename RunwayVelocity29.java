import java.util.Scanner;
public class RunwayVelocity29 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter velocity start");
double velocitystart = input.nextDouble();
System.out.print(" Enter velocity zero");
double velocityzero = input.nextDouble();
System.out.print(" Enter time ");
double time = input.nextDouble();;
double sum1 = velocitystart - velocityzero ;
double sum = sum1 / time ;
System.out.printf(" sum is %f " , sum );
}
}