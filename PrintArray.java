// Print Module for arrays 

/* 
int[][] NumberArray = {{1,2,3,4},{5,6,7,8}};
PrintArray.printOutNumberMultiArray(NumberArray);

int[] Numbers = {1,2,3,4,5};
PrintArray.printOutNumberArray(Numbers);

String[] Strings = {"one", "Two", "Three", "Four", "Five"};
PrintArray.printOutStringArray(Strings);

String[][] StringsTwoD = {{"one", "Two", "Three",}, {"Four", "Five"}};
PrintArray.printOutStringMultiArray(StringsTwoD); 
*/


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
