public class break_and_continue {
    public static void main(String[] args) {
        //Break statement using loops!

//        for (int i =0 ; i<5; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loops ends here");
//
//
//        System.out.println("using while loop");
//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i ==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loops ends here");
//
//
//        System.out.println("Using do while loop");
//        int j = 0;
//        do{
//            System.out.println(j);
//            System.out.println("Java is great");
//            if (j ==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            j++;
//        }
//        while (j<5);
//        System.out.println("Loops ends here");


        //continue statement using loop!
        for (int i =0 ; i<5; i++){
            if (i == 2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
        System.out.println("Loops ends here");


        System.out.println("using while loop");
        int i = 0;
        while (i<5){
            i++;
            if (i ==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }
        System.out.println("Loops ends here");


        System.out.println("Using do while loop");
        int j = 0;
        do{
            j++;
            if (j ==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("Java is great");

        }
        while (j<5);
        System.out.println("Loops ends here");
    }
}
