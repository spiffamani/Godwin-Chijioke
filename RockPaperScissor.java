import java.util.Scanner;
public class RockPaperScissor {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int computerchoice = (int)(Math.random() * 3 ) ;




int scissor = 0 ;
int rock = 1 ;
int paper = 2 ;

System.out.print(" Your Turn  " );
int userschoice = input.nextInt();



if ( computerchoice == scissor) { 
  if (userschoice == paper) {

System.out.print(" computer is scissor. you are paper. computer won");

}
}

if (computerchoice == scissor) {
 if ( userschoice == rock){


System.out.print( " computer is scissor. you are rock . you won " );
}
}

if ( computerchoice == scissor ) { 
if( userschoice == scissor) {

System.out.print(" computer is scissor . you are scissor . tie " );
}

} 


if ( computerchoice == rock ) {
  if ( userschoice == scissor){

System.out.print(" computer is rock . you are scissor . computer won " );
}
}
 

if ( computerchoice == paper ){
 if (userschoice == scissor)

  System.out.print(" computer is paper . you are scissor . you won " );

} 
}

if ( computerchoice == paper) { 
 if (userschoice == paper){
  
System.out.print(" computer is paper . you are paper . tie ");
}
 
}

if ( computerchoice == rock  ) {  
 if (userschoice == scissor) { 

System.out.print(" computer is rock . you are scissor . computer won " );

}
} 

if ( computerchoice == rock ){
  if (  userschoice == paper){
  
System.out.print(" computer is rock . you are paper . you won ");
}

}

if ( computerchoice == rock ) {
  if( userschoice == rock ){

  System.out.print(" computer is rock . you are rock . tie");
}

} 

if (computerchoice == scissor ) {
if( userschoice == scissor) {

 System.out.print(" computer is scissor . you are scissor . tie " );


}
}




}

}
