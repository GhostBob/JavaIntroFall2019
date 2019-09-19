package javaapplication96;

public class JavaApplication96 {

    public static void main(String[] args) {
        int[] fours = new int[26];

        //Initialize the values.
        for (int i = 0; i <= 25; ++i) {
            System.out.println(i);
            fours[i] = 4 * i;
        }
        System.out.println("Yay!");

        // Print values back out.
        for (int i = 0; i < 26; ++i) {
            System.out.println(fours[i]);
        }

        // Add 1 to all the values in fours
        for (int i = 0; i < 26; ++i) {
            fours[i] += 1;
        }

        // The cheater way! (the way real programmers do it)
        for (int i : fours) {
            System.out.println(i);
        }
    }
}
