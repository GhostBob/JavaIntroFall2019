package final1;

public class Final1 {

    /**
     * Write a program that uses loops to print the following:

            * * * * *
            *
            * * * *
            * *
            * * *
            * * *
            * *
            * * * *
            *
            * * * * *
            * 
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            //Draw the downward part.
            for (int j = 5 - i; j > 0; --j) {
                System.out.print("*");
            }
            System.out.println(""); //Remember to newline.

            //Draw the upward part.
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println(""); //Newline again.
        }
    }
}
