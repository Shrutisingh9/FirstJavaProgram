/*
wap to find out the type of website from the url
.com -> Commercial website
.org -> organizational website
.in -> Indian website
 */
package practiceSet4;
import java.util.Scanner;

public class ps4question6 {
    public static void main(String[] args) {
        System.out.println("Enter a website: ");

        Scanner sc = new Scanner (System.in);
        String website = sc.next();


        if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organizational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
    }
}
