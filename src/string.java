import java.util.Scanner;
import java.lang.String;
public class string {
    public static void main(String[] args) {
        //String name = new String("Shruti");
//        String name = "Shruti";
//        System.out.print("The name is: ");
//        System.out.println(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and the value of b is %.2f",a,b);
        //%d is format specifier used for int
        //%f is used for float
        //%c is used for char
        //%s is used for string

//        System.out.format("The value of a is %d and the value of b is %f",a,b);
        Scanner sc = new Scanner( System.in);
        //String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
