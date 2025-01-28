public class increment_and_decrement_operator {
    public static void main(String[] args) {
        int i = 56;
        System.out.println(i++);  //same value as operator is written after value
        System.out.println(i);   //value will increase by one

        int j = 78;
        System.out.println(++j); //value will increase fist the return
        System.out.println(j);   //same value as the vale is already increased

        //Quick Quiz : what will br the value of the following expression(x)  int y = 7;  int x= ++y*8;  value of x?
        int y = 7;
        int x = ++y*8;
        System.out.println(x);

        char ch = 'a';
        System.out.println(++ch);

    }
}
