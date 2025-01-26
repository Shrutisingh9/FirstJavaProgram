import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your subject1 marks: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter your subject2 marks: ");
        int subject2 = sc.nextInt();
        System.out.println("Enter your subject3 marks: ");
        int subject3 = sc.nextInt();
        System.out.println("Enter your subject4 marks: ");
        int subject4 = sc.nextInt();
        System.out.println("Enter your subject5 marks: ");
        int subject5 = sc.nextInt();

        float percentage = ((subject1 + subject2 + subject3 + subject4 + subject5)/500.0f)*100;

        System.out.println("percentage: ");
        System.out.println(percentage);



    }
}
