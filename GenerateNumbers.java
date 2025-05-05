import java.util.Scanner;
public class GenerateNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int random1 = (int)(Math.random)() * 100;
int random2 =(int)(Math.random)() * 100;

int sum = random1 + random2;

System.out.print("Enter answer");
int userinput = input.nextInt();

if (userinput != sum);
System.out.print("Wrong answer");

System.out.print( "The sum is " +    sum  + "  =  "    +   userinput);

}
}