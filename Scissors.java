import java.util.Random;
public class Scissors { 
public static void main(String[] args){
 
System.out.print(" Pick a number" );
double number1 = input.nextDouble();
Random computerpick = Math.random * (3) ;

if (computerpick < number1 ) {
computerpick = number1 ;
}
else{
System.out.printf(" you win %d%n", number1);
}

if ( computerpick > number1 ) {
computerpick = number1 ;
}
else{
System.out.printf(" computer wins %d%n", computerpick);
} 

if ( computerpick == number1 ) {
computerpick = number1 ;
}
else {
System.out.printf(" you wins %d%n " , number1);
}

/**if ( computerpick < rock) ;
computerpick = rock ;


if ( computerpick > rock ) ;
computerpick = rock ;

if ( computerpick == rock );
computerpick =rock ;
System.out.printf(" you wins %d%n" , computerpick);



if ( computerpick < papper ) ;
computerpick = papper;


if (computerpick > papper ) ;
computerpick = papper;


if ( computerpick == papper) ;
computerpick = papper;
System.out.printf(" you wins %d%n" , computerpick);*/



}
}