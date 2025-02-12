package practiceSet5;
import java.util.Scanner;
public class ps5questions {
    public static void main(String[] args) {
        //Question 1
//        int n = 4;
//        for (int i=n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }



        //Question 2
//        int sum =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n numbers: ");
//        int n =sc.nextInt();
//        int i =0;
//        while ( i<n){
//            sum = sum +(2*i);
//            i++;
//        }
//        System.out.println("Sum of even numbers is: ");
//        System.out.println(sum);




        //Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = sc.nextInt();
//        for (int i = 1; i<=10; i++){
//            System.out.printf("%d X %d =%d\n",n,i, n*i);
//        }




        //Question 4
//        int n = 10;
//        for (int i = 10; i>=1; i--){
//            System.out.printf("%d X %d =%d\n",n,i, n*i);
//        }




        //Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        long factorial = 1; // Use long to handle larger factorials
//
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("Factorial of " + n + " is: " + factorial);




        //Question 6
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        int i = 1;
//        int factorial =1;
//        while(i<=n){
//            factorial *=i;
//            i++;
//        }
//        System.out.println("Factorial of " + n + " is: " + factorial);





        //Question 7
//        int n = 4;
//        int i = n;
//        while ( i>0 ){
//            int j=0;
//            while ( j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i--;




            //question 9
//            int n = 8;
//            int sum = 0;
//            for (int i = 1; i<=10; i++){
//                sum += n*i;
//            }
//            System.out.println(sum);




        //Question 11
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n numbers: ");
        int n =sc.nextInt();
        for (int i =0; i<n; i++){
            sum = sum +(2*i);
        }
        System.out.println("Sum of even numbers is: ");
        System.out.println(sum);


    }
}
