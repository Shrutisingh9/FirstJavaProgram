//wap to detect double  and triple spaces in a string
package practiceSet3;

public class ps3question4 {
    public static void main(String[] args) {
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

    }
}
