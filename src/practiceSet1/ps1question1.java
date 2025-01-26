// write a program to se=um three numbers in java
package practiceSet1;

import java.util.Scanner;

public class ps1question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();
        System.out.println("Enter number3: ");
        int c = sc.nextInt();

        int sum = a+b+c;

        System.out.println("sum: ");
        System.out.println(sum);
    }



}
