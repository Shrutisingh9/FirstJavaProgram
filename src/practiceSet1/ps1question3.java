//wap to which asks the user to enter his/her name and greet them with "hello <name> , have a good day " text.
package practiceSet1;

import java.util.Scanner;

public class ps1question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Hello "+name+", have a good day.");
    }
}
