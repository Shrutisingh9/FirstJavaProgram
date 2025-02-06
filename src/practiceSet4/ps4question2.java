/*
wap to find out whether a student is pass or fail:
if it requires total 40% and at least 33% in each subject to pass.
Assume 3 subject and take marks as an input from the user.
 */
package practiceSet4;

import java.util.Scanner;

public class ps4question2 {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in mathematics");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("You overall percentage is: " +avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation, You are Pass");
        }
        else{
            System.out.println("Sorry, You are Fail. Please try again.");
        }
    }
}
