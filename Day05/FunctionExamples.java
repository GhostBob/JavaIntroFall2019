
package javaapplication100;

public class JavaApplication100 {

    public static void main(String[] args) {
        hello();
        hello();
        hello();
        add(1,2);
        int x = add(123,321);
        System.out.println(x);
    }
    
    public static void hello() {
        System.out.println("Hello, world!");
    }
    
    public static int add(int x, int y) {
        return x+y;
    }
    
    public static int add(int x, int y, int z) {
        return x+y+z;
    }
    
    public static double add(double x, double y) {
        return x+y;
    }
    
    public static int doStuff(String babby, double d) {
        System.out.println("Babby is " + babby + "yay! for" + d);
        return (int)d;
    }
    
    public static String doStuff(String babby, int question) {
        System.out.println("Babby is " + babby);
        return "Whops" + question * question;
    }
}
