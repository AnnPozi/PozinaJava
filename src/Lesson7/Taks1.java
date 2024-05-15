package Lesson7;

public class Taks1 {
    public static void main(String[] args) {
        int a = 4;
       int res = perimetr(a);
        System.out.println("Периметр равняется = " + res);
    }
    public static int perimetr(int a){
        int p = a*4;
        return p;
    }
}
