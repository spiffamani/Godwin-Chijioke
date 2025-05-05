import java.util.Scanner;
public class StudentsScores{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

// prompt user to Enter number

int print = 0 ;

int Student1 = 1 ;
int student2 = 0;
string studentA = input.next();
string studentB = input.next();


System.out.print( " Enter number of student ");
String userinput = (int)(Math.random()*100);

for( print = 0 ; print <= userinput ; print++)
if (userinput % student1  ) {
System.out.print( "Highest score"     +    studentA );

}else if (userinput < student1  ){ 
System.out.print("Highest score"   +  studentB );

}if (userinput % student2  ){ 
System.out.print("Highest score" +  studentA);


}else if (userinput > student1  ) {
System.out.print("Highest score"    +     StudentB );



}

}


}