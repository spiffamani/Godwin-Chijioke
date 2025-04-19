// Showing current time :

public class CurrentTime {
public static void main(String[] args) {

long milliseconds = System.currentTimeMillis();
// divide milliseconds by 1000 to get seconds;
long totalseconds = milliseconds / 1000;
long currentseconds = totalseconds % 60  ;
// divide totalseconds by 60 to get totalminutes ;
long totalminutes = totalseconds / 60 ;
long currentminutes = totalminutes % 60  ;
// divide totalminutes by 60 to get totalhours;
long totalhours = totalminutes / 60 ;
long currenthours = totalhours % 24  ;
System.out.println("current time is " + currenthours +  ":" + 
currentminutes +   ":"+ currentseconds + " GMT "   );
}
}