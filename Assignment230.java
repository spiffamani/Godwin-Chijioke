import java.util.Scanner;
public class Assignment230 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter first number: ");
int a = input.nextInt();

int b = 0;
int c = 0;
int d = 0;
int e = 0;
int f = 0;

if (a >= 10000 )
if ( a <= 99999)

b = a / 10000;
a = a -  b* 10000;
c = a / 1000;
a = a - c * 1000;
d = a / 100;
a = a - d * 100;
e = a / 10;
a = a - e * 10;
f =a;

System.out.printf("%d",     b );

System.out.printf("%d",      c);

System.out.printf("%d",      d);

System.out.printf("%d",      e);

System.out.printf("%d",      f);

}
}