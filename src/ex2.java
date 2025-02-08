import java.util.Scanner;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(("Enter 0 for Rock ,1 for Paper,2 for Scissor "));
        int userInput = sc.nextInt();

        Random rn = new Random();
        int computerInput = rn.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 1 ){
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer win!");
        }

        //computer choice
        if(computerInput == 0){
            System.out.println("Computer choice : Rock");
        }else if (computerInput == 1){
            System.out.println("Computer choice :Paper");
        }
        else if (computerInput == 2){
            System.out.println("Computer choice :Scissors");
        }
    }
}
