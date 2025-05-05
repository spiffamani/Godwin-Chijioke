import java.util.Scanner.
public class StudentScore{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int numberofstudent= 0 ;
int highestscore = 0 ;
System.out.print("Enter number of student");
int studentnumber = input.nextInt();

System.out.print("Enter student name ");
String studentname = input.next();

System.out.print("Enter student score" );
int studentscore = input.next();

while(numberofstudent <= 3){

//numberofstudent++ ;

if (numberofstudent == studentscore){
   numberofstudent = studentscore;
else if (studentscore > numberofstudent)
  System.out.println("Highest score is " + studentname +  studentscore);

}
}
}
