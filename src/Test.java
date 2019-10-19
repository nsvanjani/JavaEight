import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {

Scanner s =  new  Scanner(System.in);

String length = s.nextLine();
Integer arlen =  Integer.parseInt(length);
String secondIp = s.nextLine();
String [ ] numbers = secondIp.split(" ");
ArrayList<Integer> list = new ArrayList<>(arlen);
for (String string : numbers) {
	list.add(Integer.parseInt(string));
}
Integer[ ] arr = new Integer[arlen];
 arr =  list.toArray(arr);

Arrays.sort(arr);
Integer num = arr[0];
Integer ClosestValue = 0;
int curr = 0;
int near = arr[0];
for ( int i=0; i < arr.length; i++ ){
    System.out.println("dist from " + arr[i] + " = " + Math.abs(0 -arr[i]));
    curr = arr[i] * arr[i]; 
    if ( curr <= (near * near) )  { 
        near = arr[i];
    } 
}
System.out.println("near "+ near );
list.stream().filter(x -> x>0 &&x>1).collect(Collectors.toList()).size();
}

}
