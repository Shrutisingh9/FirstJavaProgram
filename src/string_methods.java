public class string_methods {
    public static void main(String[] args) {
        String name = "Shruti";
        System.out.println(name);

        //name.length() method
        int value = name.length();
        System.out.println(value);

        //name.toLoweCase() method
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        //name.toUpperCase() method
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        //name.trim() method
        String nonTrimmedString= "     Shruti     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));

        //name.replace() method
        System.out.println(name.replace('u','p'));
        System.out.println(name.replace("uti", "xyz"));

        //name.startsWith() method
        System.out.println(name.startsWith("Shr"));

        //name .endsWith() method
        System.out.println(name.endsWith("ti"));

        //name.charAt() method
        System.out.println(name.charAt(3));

        //name.indexOf() method
        System.out.println(name.indexOf("uti"));
        String modifiedName = "Shrutiuti";
        System.out.println(modifiedName.indexOf("uti",4));

        //name.lastIndexOf() method
        System.out.println(modifiedName.lastIndexOf("ti"));
        System.out.println(modifiedName.lastIndexOf("ti",5));

        //name.equals() method
        System.out.println(name.equals("Shruti"));
        System.out.println(name.equals("shruti"));

        //name.equalsIgnoreCase() method
        System.out.println(name.equalsIgnoreCase("shruti"));


        //escape sequence
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ backslash");
        System.out.println("I am escape sequence \n new line");


    }
}
