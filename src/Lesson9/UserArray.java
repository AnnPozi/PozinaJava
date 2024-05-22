package Lesson9;

public class UserArray {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 7, 9};
        arrayPlusValue(ar, 222);
    }

    public static int[] arrayPlusValue(int[] array, int value) {
        int index = array.length + 1;
        int[] newAr = new int[index];
        newAr[0] = value;
        System.out.println(newAr[0]);
        for (int i = 0; i < newAr.length-1; i++) {
            newAr[i + 1] = array[i];
            System.out.println(newAr[i+1]);
        }
        return newAr;
    }
}
