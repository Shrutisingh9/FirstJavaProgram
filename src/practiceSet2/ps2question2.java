//wap to encrypt a grade by adding 8 to it .Decrypt it to show the correct grade
package practiceSet2;

public class ps2question2 {
    public static void main(String[] args) {
        //using character value
        //Encrypting the grade
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //using integer value
        //Encrypting the grade
        int grade1 = 7;
        grade1 = (int)(grade1 + 8);
        System.out.println(grade1);
        // Decrypting the grade
        grade1 = (int)(grade1 - 8);
        System.out.println(grade1);

    }
}
