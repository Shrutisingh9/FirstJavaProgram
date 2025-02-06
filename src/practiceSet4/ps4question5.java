//wap to find whether a year entered by the user is a leap year or not.
package practiceSet4;
import java.util.Scanner;
public class ps4question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();

        if((year %4 ==0 && year %100!=0)||year %400 == 0 ){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a lear year");
        }
    }
}
