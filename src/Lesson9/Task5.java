package Lesson9;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] arr2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] arrSum = new int[3][3];

        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j < 3; j++) {
               arrSum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
