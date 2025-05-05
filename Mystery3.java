
import java.util.Scanner;
public class Mystery3 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("pck a number");
int userinput = input.nextInt();

for(int j = userinput ; j >= 0; j--){
System.out.print(userinput);
}


/*for(int i = 0; i <= userinput; i++){
System.out.print(i);
System.out.println();
}*/

for(int i = 0; i <= userinput + 2; i++){
System.out.print(i);
System.out.println();
}
for(int j = userinput ; j >= 0; j--){
System.out.print(j);
}

System.out.println();


}
}


