//wap to detect whether a number entered by the user is integer or not
package practiceSet1;
import java.util.Scanner;

public class ps1question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.next();

        if (input.contains(".")) {
            System.out.println("Not an integer.");
        } else {
            System.out.println("Integer.");
        }

    }
}
