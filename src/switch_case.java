import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter Your Age: ");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become an adult!");
                break;
            case 23:
                System.out.println("you are going to join a job!");
                break;
            case 60:
                System.out.println("you are going to get retired!");
                break;
            default:
                System.out.println("ENJOY YOU LIFE!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}
