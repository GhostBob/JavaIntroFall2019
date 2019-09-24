package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        int x = 3;
        x = foo(x);
        System.out.println(x);
        String s = "Everything";
        bar(s);
        System.out.println(s);
        System.out.println("Playing with factorials...");
        int factorialed = factorial(5);
        System.out.println(factorialed);
    }
    
    // An example of a recursive function.
    public static int factorial(int x) {
        if (x == 1) {
            return x;
        }
        else {
            return x * factorial(x-1);
        }
    }
    
    // Remember that methods are pass by copy (but arrays kinda cheat)
    public static int foo(int y) {
        y += 3;
        System.out.println("foo: " + y);
        return y;
    }
    
    public static String bar(String s) {
        s = s + " is awesome.";
        System.out.println("bar: " + s);
        return s;
    }
}
