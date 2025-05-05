import java.util.Scanner;
public class MonthAndDays {
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int days = 31;
int userinput;


System.out.print("Enter today's day");
userinput = input.nextInt();
for(days = 0; days < 31; days++)
if (userinput > days)
break;
userinput = input.nextInt();
switch(days ) {
	case 1 : 
       	System.out.println("Monday");
	userinput = input.nextInt();
	break;
	
	case 2 : 
	System.out.println("Tuesday");
	userinput = input.nextInt();
	break;
	
	case 3 :
	System.out.println("Wednesday");
	userinput = input.nextInt();
	break;
	
	case 4 : 
	System.out.println("Thursday");
	
	break;
	
	case 5 :
	System.out.println("Friday");
	
	break;
	
	case 6 : 
	System.out.println("Saturday");
	
	break;
	
	case 0 : 
	System.out.println("Sunday");
	
	

System.out.print("  today is  "  +    days   +    userinput);
break;
}
}

}




