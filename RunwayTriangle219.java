import java.util.Scanner;
public class RunwayTriangle219 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print(" Enter first sides x1 and y1  " );
double x1 = input.nextDouble();
double y1 = input.nextDouble();

System.out.print(" Enter second sides x2 and y2 " );
double x2 = input.nextDouble(); 
double y2 = input.nextDouble();

System.out.print(" Enter third sides x3 and y3 " );
double x3 = input.nextDouble();
double y3 = input.nextDouble();

double side1 =( (x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) ;
double side2 = ((x3 - x2) * (x3 - x2)) + ((y3 - y2) *(y3 - y2)) ;
double side3 =( (x3 - x1) * (x3 - x1)) + ((y3 - y1) *(y3 - y1));

double a = (side1 + side2 + side3 ) ;
double s = a / 2 ;



double area = (s - side1 ) * (s - side2) * (s - side3);
double area1 = s * area ;
double area2 = Math.sqrt(area);

System.out.printf(" sum is %f " , + area2);

}
}