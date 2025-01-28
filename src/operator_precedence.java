public class operator_precedence {
    public static void main(String[] args) {
        //Precedence & Associativity
        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and / .They are then evaluated on the basis of left to right associativity.
        6*5 -> 30
        30- 34/2
        30-17
        =>13
         */

        int b = 60/5-34*2;
        /*
        Highest precedence goes to * and / .They are then evaluated on the basis of left to right associativity.
        60/5 -> 12
        12-34*2
        34*2 -> 68
        12-68 =>  -56
         */
        System.out.println(a);
        System.out.println(b);

        //Quick Quiz
        /*
          x-y
         -----
           2
         */

        int x= 5;
        int y= 1;

        int z = (x-y)/2;
        System.out.println(z);

        /*
        e^2 - 4df
        ---------
           2d
         */
        int e= 1;
        int d= 5;
        int f= 4;
        int g = e*e - (4*d*f)/(2*d);
        System.out.println(g);
    }
}
