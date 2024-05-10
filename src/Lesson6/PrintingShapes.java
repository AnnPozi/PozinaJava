package Lesson6;

public class PrintingShapes {
    public static void main(String[] args) {


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        int t = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                while (t == i) {
                    System.out.print("*");
                   t=t-i;
                   break;
                }

            }
           System.out.print("\n");
        }
    }
}
