
public class Print {
    public static void main(String[] args) {

    
        for( int i = 1; i <=4; i++) {
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n");

        for( int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i==1 || i == 5 || j == 1 || j == 5 ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        
            for(int k = 1; k <= 9; k++){
                for( int j = 1; j <= 9; j++){
                    if( k == 1 || k == 2 || k == 8 || k == 9 || j == 1 || j == 2 || j == 8 || j == 9  ) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
                }
            
    }
        
    
}
