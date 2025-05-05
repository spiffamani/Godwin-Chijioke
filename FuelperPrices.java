import java.util.Scanner;
public class FuelperPrices{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double priceperlitre = 855;
double budget;
double total;

System.out.println("price per liter , = 855 ");


System.out.print("Enter budget ");
budget = input.nextInt();



total = budget / priceperlitre ;
System.out.print(total);


}
}

