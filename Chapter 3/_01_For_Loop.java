
public class _01_For_Loop {
    public static void main(String[] args) {

        System.out.println("\n1.Use of For Loop; ");
        
        for( int i = 1; i <=10; i++) {
        System.out.println(i);
        }

        System.out.println("\n2.Use of For Loop; ");


        for( int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("\n3.Use of For Loop; ");



        int sum = 0;
        for ( int i = 0; i <= 110; i = i+1 ) {
            sum = sum + i;

        }
        System.out.println("1 se 10 numbers ka addition; " +sum);

        
        System.out.println("\n4.Use of For Loop; ");



        for( int i = 1; i <= 20; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n5.Use of For Loop; ");


        for( int i = 20; i >= 0; i--) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n6.Use of For Loop; ");

        int oddsum = 0;
        for(int i = 1; i <= 50; i++) {
            if(i%2 != 0) {
                oddsum = oddsum + i;
            }
        
        }

        System.out.println("1 se 50 tak ke odd numbers ka addition; " +oddsum);

        System.out.println("\n7.Use of For Loop; ");

        for(int i =1; i <=30; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n8.Use of For Loop; ");


        int multiply = 1;
        for(int i = 1; i <= 5; i++) {
            multiply = multiply*i;
        }
        System.out.println("1 se 5 tk ka multiplication; " +multiply);

        System.out.println("\n9.Use of For Loop; ");


        for(int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 !=0) {
                System.out.println(i);
            }
        }





        

    }
    
}
