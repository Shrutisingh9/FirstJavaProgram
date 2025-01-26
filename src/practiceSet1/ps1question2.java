//write a program to calculate CGPA using marks of three student out of 100

package practiceSet1;

import java.util.Scanner;

public class ps1question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of sub1: ");
        float sub1 = sc.nextInt();
        System.out.println("enter marks of sub2: ");
        float sub2 = sc.nextInt();
        System.out.println("enter marks of sub3: ");
        float sub3 = sc.nextInt();

        float percentage = ((sub1 + sub2 + sub3)/300.0f)*100;
        double CGPA = percentage/9.5;
        System.out.println("CGPA: ");
        System.out.println(CGPA);
    }
}
