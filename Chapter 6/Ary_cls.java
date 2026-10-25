import java.util.*;

public class Ary_cls {
    public static void main(String args []){
    Scanner sc = new Scanner(System.in); 
    // int size = sc.nextInt();
    // int numbers[] = new int[size];
    // for(int i=0; i<size; i++){
    //     numbers[i] = sc.nextInt();
    // }
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;

    // for(int i=0; i<numbers.length; i++){
    //     if(numbers[i] > max){
    //         max = numbers[i];
    //     }
    //     if(numbers[i] < min){
    //         min = numbers[i];
    //     }
    // }
    // System.out.println("Maximum: " + max);
    // System.out.println("Minimum: " + min);

    // System.out.println("-----------------------------------------------------------------------------------------------------------------");
    // System.out.println("Enter the size of the array:");
    // int sizz = sc.nextInt();
    // int number[] = new int[sizz];
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;

    // for(int i=0; i<sizz; i++){
    //     number[i] = sc.nextInt();

    // }
    // for(int i=0; i<number.length; i++){
    //     if(number[i] > max){
    //         max = number[i];
    //     }
    //     if(number[i] < min){
    //         min = number[i];
    //     }
    // }
    // System.out.println("Maximum Number: " + max);
    // System.out.println("Minimum Number: " + min);


    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println("Enter the size of the array:");
    int sizes = sc.nextInt();
    int numberss[] = new int[sizes];
    for(int i=0; i<sizes; i++){
        numberss[i] = sc.nextInt();
    }
    for(int i=0; i<numberss.length; i++){
        System.out.println(numberss[i] );
    }
}
}










