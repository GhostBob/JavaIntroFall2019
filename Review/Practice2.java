
package practice2;

public class Practice2 {

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {0, 1, 2, 3, 4};
        int[] array3 = {0, 1, 2, 4, 10};
        int[] array4 = {0, 1};
        
        System.out.println("Array 1 and 2: " + areEqual(array1, array2));
        System.out.println("Array 1 and 3: " + areEqual(array1, array3));
        System.out.println("Array 1 and 4: " + areEqual(array1, array4));
    }
    
    public static boolean areEqual(int[] a1, int[] a2) {
        if (a1.length != a2.length)
            return false;
        
        for(int i=0; i<a1.length; ++i) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }
    
}
