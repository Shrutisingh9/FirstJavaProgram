/*
Calculate income tax paid by an employee to thw gov as per the slabs mentioned below:
income slab  |  Tax
2.5L - 5.0L  |  5%
5.0L - 10.0L |  20%
Above 10.0L  |  30%
Note that there o=is no tax below 2.5L .
Take input amount as an input from the user
 */
package practiceSet4;
import java.util.Scanner;
public class ps4question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Income: ");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income> 2.5f && income<= 5.0f){
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if (income> 5.0f && income<= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f*(income - 5.0f);
        }
        else if (income> 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5.0f);
            tax = tax + 0.03f*(income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is : "+tax);
    }
}
