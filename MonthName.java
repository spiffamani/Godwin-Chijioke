import java.util.Scanner;
public class MonthName {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int userinput;
int month = 0 ;
	while(month < 12) {
	System.out.print("Enter Month: ");
	userinput = input.nextInt();
	month++;

	switch (userinput) {
	case 1: 
         System.out.println("Jnauary"); 
         break;
	case 2: 
	System.out.println("February"); 
	break;
        case 3: 
        System.out.println("march"); 
        break;
        case 4: 
        System.out.println("april");
        break;
        case 5: 
        System.out.println("may");
         break;
        case 6:
        System.out.println("June");
        break;
        case 7: 
        System.out.println("July"); 
        break;
        case 8:
        System.out.println("august"); 
        break;
        case 9: 
        System.out.println("september"); 
        break;
        case 10: 
        System.out.println("october"); 
        break;
        case 11: 
        System.out.println("november");
        break;
        case 12: 
	System.out.println("December");
	break;
	default:
	System.out.print("invalid input");
	break;

}
}
}
}