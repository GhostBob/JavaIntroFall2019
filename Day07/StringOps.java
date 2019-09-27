package javaapplication110;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //So far, this is all we've really done with strings, which is sad...
        String hello = "Hello, world!";
        String hollo = "Hollo, world!";
        
        //These are the three Objects we've seen that aren't base datatypes.
        //The cool thing about them is that they have METHODS attached to them.
        //You access these methods by using a '.' after the name.
        //Example: random.nextInt();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = "Robert";
        
        //There's also Object versions of all the basic datatypes.
        Integer bigI = 3;
        Float bigF = 2.0f;
        Double bigD = 2.0;
        Boolean bigB = false;
        Character bigC = 'c';
        Byte bigB2 = 2;
        Short bigS = 3;
        Long bigL = 123l;
        
        //They have some cool stuff they can do. Most important one is...
        //Turning a String into an integer
        System.out.println("Please enter a number: ");
        String userInput = scanner.nextLine();
        int userInt = Integer.parseInt(userInput);
        
        
        //Going the other way is also really handy.
        //Turning numbers into Strings
        String notNumber = String.valueOf(userInt);
        System.out.println(notNumber);
        
        //String concatenation via concat AND the + sign.
        String hello2 = "Hello".concat(", world!");
        String hello3 = "HEllo" + ", world!";
        
        //Getting the character at an address (treating a string like an array)
        char c = hello.charAt(12);
        System.out.println(c);
        
        //String equality (whether they have the same text)
        boolean equals = hello.equals(hollo);
        //boolean wrong = "Hello, world!" == hello; DON'T COUNT ON THIS TO WORK
        
        //Comparing strings, negative means before, positive after, 0 is equal.
        int blah = hello.compareTo(hollo);
        System.out.println(blah);
        
        //Comparing strings, ignoring differences in capitalization
        int blah2 = hello.compareToIgnoreCase(hollo);
        System.out.println(blah2);
        
        //String equality, ignoring capitalization
        boolean equals2 = hello.equalsIgnoreCase(hello3);
        System.out.println(equals2);
        
        //Whether a string contains another string.
        boolean contains = hello.contains("world");
        System.out.println(contains);
        
        //Whether a string starts or ends with a certain string
        boolean endsWith = hello.endsWith("world!");
        boolean startsWith = hello.startsWith("Hello");
        System.out.println(endsWith + " " + startsWith);
        
        //Finding the index of a character or string in a string
        int indexOfw = hello.indexOf('w');
        int indexOfWorld = hello.indexOf("world");
        
        //Find the LAST index of a thing is also a thing
        int lastIndexOf = hello.lastIndexOf("o");
        
        //Testing for empty strings. Useful for forms and database fetches
        boolean empty = "".isEmpty(); //True
        boolean empty2 = hello.isEmpty();
        
        //Getting the length of a string
        int length = hello.length();
        
        //Replacing characters or strings. Very fun.
        String sfw = "forkyou".replace("fork", "f***");
        System.out.println(sfw);
        
        //Replacing only the first instance
        String kindasfw = "fork you forkers".replaceFirst("fork", "f***");
        System.out.println(kindasfw);
        
        //Splitting a string into an array of Strings
        String[] splitUp = hello.split("o");
        for (String s : splitUp) {
            System.out.println(s);
        }
        
        //Splitting a string using a specified start/end location
        String some = hello.substring(4);
        String some2 = hello.substring(4, 7);
        System.out.println(some);
        System.out.println(some2);
        
        //Turning strings into a character array, the easy way.
        //The hard way exists, and it sucks. But it's more customizable.
        char[] chars2 = hello.toCharArray();
        for (char c3po : chars2) {
            System.out.println(c3po);
        }
        
        //Turning strings into all lowercase or all uppercase
        String lower = hello3.toLowerCase();
        String upper = hello3.toUpperCase();
        
        //This is ridiculous, but necessary because Java language contract
        String redundant = hello.toString();
        
        //Trimming outer whitespace while leaving inner whitespace intact.
        String trimmed = "    hello, wordl!   ".trim();
        System.out.println(trimmed);
        //It's also possible to trim ALL spaces by doing...
        String superTrim = "    hello, wordl!   ".replace(" ", "");
        System.out.println(superTrim);
    }
    
}
