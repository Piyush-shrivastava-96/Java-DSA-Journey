import java.util.*;
public class Two_D_Ary {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in); 
        int rows = sc.nextInt();
        int colm = sc.nextInt(); 
        int[][] arr = new int[rows][colm];

        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to search X");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                if(arr[i][j] == x){
                    System.out.print("X found at location = " + "(" + i + "," + j + ")");
                }
                
            }
            System.out.println();
        }

    }
    
}
