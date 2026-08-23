public class Pattern_Advanced {
    public static void main(String[] args){
        // for(int i = 1; i <= 4; i++){
        //     for(int j=1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j<=2*(4-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 4; i >= 1; i--){
        //     for(int j=1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j<=2*(4-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<=5; i++){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");

        //     }
        //     for(int j = 1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 5; i>=1; i--){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");

        //     }
        //     for(int j = 1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=5; i>=1; i--){
        //     for(int j=3*i-2; j>=1; j--){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        // for(int i=2; i<=5; i++){
        //     for(int j=1; j <= 3*i-2; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }


        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


    //    for(int i=1; i<=4; i++){
    //     for(int j=1; j<=4-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++){
    //         if(j==1|| j==i ){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    //    }
    //    for(int i=4; i>=1; i--){
    //     for(int j=1; j<=4-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++){
    //         if(j==1 || j==i){
    //         System.out.print("*"+" ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    //    }

//    for(int i=1; i<=5; i++){
//     for(int j=1; j<=5-i; j++){
//         System.out.print("  ");
//     }
//     for(int j=i; j>=1; j--){
//         System.out.print(j+" ");
//     }
//     for(int j=2; j<=i; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
//    }


    for(int i=1; i<=6; i++){
        for(int j=1; j<=6-i; j++){
            if(i==1 || j==1 || j==6-i){   
                System.out.print(j+" "); 
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
        
    }
    
}
