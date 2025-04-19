import java.util.Scanner;
public class years {
public static void main( String[] args ) {
Scanner input = new Scanner(System.in);
System.out.printf(" Enter the minutes ");
int minutes = input.nextInt();
int time = 365 * 24 * 60 ;
int sum = minutes / time; 
System.out.printf(" sum is %d " , sum);
int day1 = minutes % time  ;
int day2 = 24 * 60 ;
int sum2 = day1 / day2;
System.out.printf(" sum is %d " , sum2);
}
}


