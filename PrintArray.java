// Print Module for arrays 

public class PrintArray {


    // Single Arrays

    public static void printOutNumberArray(int[] Array) {
        for (int i = 0; i<Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }

    public static void printOutStringArray(String[] Array) {
        for (int i = 0; i<Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }

    // 2D Arrays
    
    public static void printOutNumberMultiArray(int[][] Array) {

        for (int i = 0; i < Array.length; i++) {
            for (int inner = 0; inner < Array[i].length; inner++) {
                System.out.print(Array[i][inner] + " ");
            }
            System.out.println();
        }
    }

    public static void printOutStringMultiArray(String[][] Array) {

        for (int i = 0; i < Array.length; i++) {
            for (int inner = 0; inner < Array[i].length; inner++) {
                System.out.print(Array[i][inner] + " ");
            }
            System.out.println();
        }
    }

}
