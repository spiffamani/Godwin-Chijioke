import java.util.Scanner;
public class Gratuity {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter subtotal " ) ;
double subtotal = input.nextDouble();
System.out.print("Enter gratuity rate ");
double gratuityrate = input.nextDouble();


gratuityrate = gratuityrate / subtotal ;

double total = subtotal + gratuityrate ;

System.out.print(" The gratuity is  "  +  gratuityrate  +  " and total is " + total );
}
}