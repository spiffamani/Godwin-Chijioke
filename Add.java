public class Add {
public static void main (String[] args ){
Scanner input = new Scanner(System.in);
System.out.print (" Enter first interger " );
int number1 =input.nextInt();
System.out.print ( " Enter second integers" );
int number2 =input.nextInt();
int sum = number1 + number2;
System.out.printf( "sum  is %d%n", sum );
}
}