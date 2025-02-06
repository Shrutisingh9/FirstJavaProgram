public class logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;

        if (a && b){     // True only when all the values are true either it will return false
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR...");

        if (a || b){     // True is one of the condition is True when both are false then it returns false
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For Logical NOT..");
        System.out.println("Not (a) is");
        System.out.println(!a);
        System.out.println("Not (b) is");
        System.out.println(!b);
    }
}
