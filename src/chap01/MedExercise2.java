package chap01;

public class MedExercise2 {
    static int med3(int a, int b, int c){
        if((b >= a && c <= a) || (b <= a && c >= a)){
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("med3(10,5,6) = "+med3(10,5,6));
        System.out.println("med3(5,6,10) = "+med3(5,6,10));
        System.out.println("med3(6,10,5) = "+med3(6,10,5));
    }
}
