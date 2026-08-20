
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

        for(int n = 1; n <= 4; n++) {
            for(int m = 1; m <= 4; m++){
                if(n == 1  || m == 1  || n == 4 || m == 4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int h = 1; h <= 9; h++) {
            for(int g = 1; g <= h; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    System.out.println("\n**************************************\n");

    for(int b = 9; b >= 1; b--){
        for(int v = b; v >= 1; v--){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int x = 1; x <= 4; x++){
        for(int z = 1; z <= x-1; z++){
            System.out.print(" ");
        }
        for(int z = 1; z <= 5-x; z++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i = 1; i <= 6; i++){
        for(int j = 1; j <= 6-i+1; j++){
            System.out.print(j +"");
        }
        System.out.println();
    }


    int number = 1;
    for(int i = 1; i<=5; i++){
        for(int j=1; j<=i; j++){
            int sum = i + j;
            if(sum % 2 == 0){
                System.out.print("1");

            }
            else{
                System.out.print("0");
            }
            
        }
        System.out.println();
    }
    int counter = 1;
    for(int i=1; i<=5; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(counter + " ");
            counter++;

        }
        System.out.println();
    }
    
 }
}
