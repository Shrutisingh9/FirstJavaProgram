//wap to convert kilometers to mile

package practiceSet1;
import java.util.Scanner;
public class ps1question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double kilometers;

        System.out.println("Please enter kilometers:");
        kilometers = sc.nextDouble();

        double miles = kilometers / 1.609;

        System.out.println(miles + " Miles");
    }
}
