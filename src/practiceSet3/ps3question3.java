/*wap to fill in a letter template which looks like
 letter = "Dear <|name|> , Thanks a lot"
 Replace <|name|> with a string (some name)*/
package practiceSet3;

public class ps3question3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|> , Thanks a lot";
        letter = letter.replace ("<|name|>" , "Shruti");
        System.out.println(letter);
    }
}
