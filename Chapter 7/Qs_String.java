import java.util.*;

public class Qs_String {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String names[] = new String[size];
    for(int i=0; i<size; i++){
        names[i] = sc.next();

    }
     int total = 0;
    for(int i=0; i<names.length; i++){
        System.out.println(names[i].length());
       
        total += names[i].length();
    }
    System.out.println();
    System.out.println(total);
    



    }
    
}
