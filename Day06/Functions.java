
package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        int x = returnsThree();
        String s = concatenate("Hello, ", "world!");
        s = concatenate("Hello, ", "world!", " My name is Steven.");
        
        System.out.println(x);
        System.out.println(s);
    }
    
    public static int returnsThree() {
        return 3;
    }
    
    public static String concatenate(String one, String two) {
//        System.out.println(one + two);
        return one + two;
    }
    
    public static String concatenate(String one, String two, String three) {
        return one + two + three;
    }
}
