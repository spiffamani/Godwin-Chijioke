import java.util.Scanner;
public class ValidScore {
public static void main(String[] args){


Scanner input = new Scanner(System.in);



int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0 ;
int countF = 0;


int userinput;
int invalid = 0 ;
int valid = 0 ;

while(valid <= 10 ){

System.out.println("Enter grades: ");
userinput = input.nextInt();

if(userinput < 0 || userinput > 100 ){
System.out.print("Invalid input");

invalid++ ;
continue;
}

if (userinput >= 0 && userinput <= 100){

valid++;
}

switch(userinput / 10){
	case 8,9,10 : {System.out.println("Grade A"); 
		countA++;
		break;}	
       case 7  : {System.out.println("Grade B"); 
		countB++;
		break;} 
	case 6  : {System.out.println("Grade C"); 
                 countC++;
		break;}
	case 5  : {System.out.println("Grade D"); 
                countD++;
		break;}
	case 4,1 : {System.out.println("Grade F");
                countF++;
		break;
}

}
System.out.println(+countA);
System.out.println(+countB);
System.out.println(+countC);
System.out.println(+countD);
System.out.println(+countF);
}



}
}