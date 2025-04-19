import java.util.Scanner;
public class RunwayHealth214 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter pounds");
double pounds = input.nextDouble();
System.out.print("Enter height");
double height = input.nextDouble();
double sum1 = 703 ;
double sum2 = pounds * sum1 ;
double sum3 =  height * height ;
double Bmi =sum2 / sum3 ;

System.out.printf(" Bmi is %f " , Bmi);
}
}