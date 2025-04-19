import java.util.Scanner;
public class Assignment235 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print( " Enter number of stones " );
double numberofStones = input.nextDouble() ;
System.out.print(" Enter avarage weight " );
double averageWeight = input.nextDouble();
System.out.print( "Enter number of  years " );
double numberofYears = input.nextDouble();

 double yearlyStone = ( numberofStones / numberofYears );
System.out.printf(" number of stones per year  %d " , yearlyStone );

double stoneWeight = yearlyStone * averageWeight ;
System.out.printf(" weight per year  %d"  , stoneWeight  );

double hours =( yearlyStone / 365 ) / 24 ;
System.out.printf("Each hours built %d " , hours );

double minutes = hours / 60 ;
System.out.printf(" Each minutes built  %d", minutes );


}
}