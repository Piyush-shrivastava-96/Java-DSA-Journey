import java.util.*;

public class Strings {
    public static void main(String[] args) {
    System.out.println("----------------------------2. use of Strings and length method-------------------------------------");
    Scanner sc = new Scanner(System.in);
    String firstName = "Piyush";
    String lastName = "Shrivastava";
    String fullName = firstName + " " + lastName; 
    System.out.println(fullName.length());
    System.out.println(fullName);

    System.out.println("-----------------------------2. use of compareTo() method--------------------------------------------");

    String name1 = "Piyush";
    String name2 = "Piyush";


    if(name1.compareTo(name2) == 0){
        System.out.println("Strings are equals");
    }
    else{
        System.out.println("Strings are not equal");
    }

    System.out.println("-----------------------------2. use of withoutcompareTo() method----------------------------------------\n");

     if(name1 == name2){
        System.out.println("Strings are equals");
    }
    else{
        System.out.println("Strings are not equal");
    }
    
    System.out.println("------------------------------2. use of withoutcompareTo() & different answers method---------------------\n");


    if(new String("Piyush") == new String("Piyush")){
         System.out.println("Strings are equals");
    }
    else{
        System.out.println("Strings are not equal");
    }

    System.out.println("\n------------------------------2. use of 'Substring' method---------------------\n");
    String tence = "I am a sensitive person";
    String sentence = tence.substring(17, tence.length());
    System.out.println(sentence);
    
    }
}
   