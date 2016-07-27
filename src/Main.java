/**
 * Created by localadmin on 7/27/16.
 */
public class Main {
    public static void main(String[] args){
        int aaa = add(3, 4);
        int[] evens = {2,4,6};
        int bbb = sum(evens);


        System.out.println("Hello World");
        // single line comment
        /*
            multi
            line
            comment
         */
        byte b = 30;
        short s = 23232;
        int i = 129;
        long l = 235245246462464L;
        float f = 3.141f;
        double d = 8.333d;
        char c = 'x';
        boolean bool = true;
        int ii = b;
        byte bb = (byte) i;
        float ff = (float) d;

        String s1 = "Bob";
        int [] nums = {1,2,3};
        int [] odds = new int[3];
        odds[0] =3 ;
        odds[1] =7 ;
        odds[2] = (int) 5.14 ;


        System.out.println("odds " + odds);

        if(b < 50){
            System.out.println("less than 50");
        } else {
            System.out.println("greater than 50");
        }

        switch (b){
            case 10:
                System.out.println("10");
                break;
            case 30:
                System.out.println("30");
                break;
           default:
                System.out.println("none");

        }

        for(byte j = 10; j > 0 ; j --){
            System.out.println("j is" + j);
        }
        byte jj = 10;
        while(jj > 0 ){
          System.out.println("jj is" + jj);
            jj--;
        }

        for(byte jjj = 0; jjj <odds.length;jjj++){
            System.out.println( "jjj is  " + odds[jjj]);
        }


        for(int y: odds){
            System.out.println("y is " + y);
        }

    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int sum(int[] nums){
        int total = 0;
        for(int n: nums){
            total += n;
        }
        return total;
    }
}
