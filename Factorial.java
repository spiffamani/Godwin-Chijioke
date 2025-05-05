import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int result = 0;
int counter = 0;

System.out.print("Enter a number");
int userinput = input.nextInt();
for(int i = 1; i <= userinput; i++){




result += userinput * i;

}

System.out.print(result);
}
}