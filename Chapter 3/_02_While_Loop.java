public class _02_While_Loop {
    public static void main(String[] args) {

        System.out.println("1.Use of while\n");
        int q = 1;
        while(q <= 10) {
            System.out.println(q);
            q++;
        }
        System.out.println("end!");

        System.out.println("\n2.Use of while\n");

        int w = 1;
        while(w <=10) {
            System.out.println(4*w);
            w++;
            
        
        }
        System.out.println("end");

        System.out.println("\n3.Use of while\n");

        int e = 10;
        while(e >= 1) {
            System.out.println(e);
            e--;
        }

        System.out.println("\n4.Use of while\n");

        int sn = 0;
        int y = 0;
        while(y < 20) {
            y++;
            
            if(y%2 != 0) {
             sn = sn + y;
            }
        }
        System.out.println("1 se 20 tak ke odd numbers ka addition; " +sn);

        System.out.println("\n5.Use of while\n");

        int dum = 0;
        int x = 0;
        while(x <= 50) {
            x++;
            if(x%5 == 0) {
                dum = dum + x;
            }
        }
        System.out.println("1 se 50 tak ke only 5 se katne bale numbers ka addition; " +dum);

        System.out.println("\n6.Use of while\n");


        int num = 45;
        int prod = 1;
        while(num>0) {
            int l = num%10;
            prod = prod*l;
            num = num/10;

        }
        System.out.println("The multiply of numbers; " +prod);

        System.out.println("\n7.Use of while\n");


        int a = 16662;
        int sum = 0;
        while(num>0){
            int lastdigits = a%10;
            sum = sum + lastdigits;
            a = a/10;

        }
        System.out.println("16662 The numbers of addition is;- " +sum);

        System.out.println("\n8.Use of while\n");

        int t = 456;
        int original = t;
        int reversenum = 0;
        while(t>0){
            int lastdigits = t % 10;
            reversenum = (reversenum*10) + lastdigits;
            t = t/10;
        }
        System.out.println(+original+" ka ulta " +reversenum+ " hota hai.");

        System.out.println("\n9.Use of while\n");


        int n = 153;
        int originaln = n;
        int armstrongnum = 0;
        while(n>0) {
            int lastdigits = n % 10;
            armstrongnum = armstrongnum + (lastdigits*lastdigits*lastdigits);
            n = n/10;
        }
        System.out.println(+originaln+ " ka armstrong number hai; " +armstrongnum);

    }
}
