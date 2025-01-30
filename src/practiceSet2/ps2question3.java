//use comparison operators to find out whether a given number is greater than the user entered number or not
package practiceSet2;
import java.util.Scanner;
public class ps2question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println(a > 50);
    }
}
