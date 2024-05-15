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
                while (t > 5) {
                    System.out.print("*");
                    int k = t;
                    t++;
                   break;
                }
                System.out.println();
            }
           System.out.print("\n");
        }
    }
}
