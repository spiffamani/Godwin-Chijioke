import java.util.Scanner;
public class FuelperPrice{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double priceperlitre = 855.0;
double budget= 0.0;
double total = 0.0;

System.out.println("price per liter , = 855 ");
while(true){
if(priceperlitre == 0)
break;


System.out.println("Enter budget ");
budget = input.nextInt();



total = budget / priceperlitre ;
System.out.println("price per budget is  "  +       total);

}
}
}