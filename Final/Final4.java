package final4;

public class Final4 {

    /**
     * Write a function called reverseIt that reverses all the letters in a
     * character array, and returns the new, reversed, array. Then, write a
     * function called reverseIt that reverses a string, and returns the new, 
     * reversed, string.
     */
    public static void main(String[] args) {
        String hello = "Hello, world!";
        char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};
        
        char[] srahc = reverseIt(chars);
        String olleh = reverseIt(hello);
        
        System.out.println(olleh);
        for (char c : srahc) {
            System.out.print(c);
        }
        System.out.println("");
    }
    
    public static char[] reverseIt(char[] chars) {
        //Put all the chars from chars into srahc backwards.
        char[] srahc = new char[chars.length];
        for (int i=0; i<chars.length; ++i) {
            srahc[i] = chars[chars.length-i-1];
        }
        return srahc;
    }
    
    public static String reverseIt(String s) {
        //Call the other reverseIt with s as a char array, then make a new
        // string with the results. Very fancy.
        return new String(reverseIt(s.toCharArray()));
    }
}
