 import java.util.Scanner;
public class CheckerBoard {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter radius of circle " ) ;

double r = input.nextInt() ;

double diameter = 2 * r;

System.out.printf("diameter is %f " , diameter ) ;

double circumference = 2 * 3.14159  * r;


System.out.printf("circumference is %f " , circumference ) ;

double area = 3.4159 * r * r ;



System.out.printf("area is %f " , area ) ;

}
}
