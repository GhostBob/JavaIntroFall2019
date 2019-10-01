
package practice3;

public class Practice3 {

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {0, 1, 2, 3, 4};
        int[] array3 = {0, 1, 2, 4, 10};
        int[] array4 = {0, 1};
        int[] array5 = {11, 22, 33, 44, 55};
        
        int[] common1 = getElementsInCommon(array1, array2);
        int[] common2 = getElementsInCommon(array1, array3);
        int[] common3 = getElementsInCommon(array1, array4);
        int[] common4 = getElementsInCommon(array1, array5);
        
        printArray(common1);
        printArray(common2);
        printArray(common3);
        printArray(common4);
    }
    
    public static int[] getElementsInCommon(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length];
        int count = 0;
        for(int i=0; i<a1.length; ++i) {
            for(int j=0; j<a2.length; ++j) {
                if (a1[i] == a2[j]) {
                    a3[count] = a1[i];
                    count++;
                    continue;
                }
            }
        }
        int[] retArray = new int[count];
        for(int i=0; i<retArray.length; ++i) {
            retArray[i] = a3[i];
        }
        return retArray;
    }
    
    public static void printArray(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array!");
            return;
        }
        
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("\n");
    }
    
}
