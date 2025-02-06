/*
wap to find out the day of the week given the number
[1 for monday, 2 for tuesday ...and so on1
 */
package practiceSet4;
import java.util.Scanner;
public class ps4question4 {
    public static void main(String[] args) {int day;
        System.out.println("Enter number btw 1 - 7: ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7-> System.out.println("sunday");
        }

    }
}
