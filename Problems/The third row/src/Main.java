import java.util.Scanner;

class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.print(twoDimArray[2][i]);
        }

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int[][] array = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                array[i][j] = i+j;
//                System.out.print(array[i][j]);
//            }
//            System.out.println("");
//        }
//        printTheThirdRow(array);
//    }
}