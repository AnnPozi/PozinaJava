package Lesson9;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        myReverse(arr);
    }

    public static int[] myReverse(int[] array) {
        int length = array.length;
        int[] newArr = new int[length];
        for (int i = 0; i < newArr.length; i++) {
            int j = length - i - 1;
            newArr[i] = array[j];
        }
       //comparing arrays
        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(array[i] + " ");
            System.out.print(newArr[i] + " ");
            System.out.println();
        }

        return newArr;
    }
}
