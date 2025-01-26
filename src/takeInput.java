import java.util.Scanner;
public class takeInput {
    public static void main(String[] args) {
        System.out.println("Take input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();

//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//
//        float sum = b +b;
//        System.out.println("The sum of these number is");
//        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);


    }
}
