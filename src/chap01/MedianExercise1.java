package chap01;

public class MedianExercise1 {
    static int medEx(int a, int b, int c) {
        int med = a;
        if(med >= b) {
            if(b >= c) {
                med = c;
            } else if (med <= c) {
                return med;
            } else {
                med = c;
            }
        } else if (med > c) {
            return med;
        } else if (b > c) {
            med = c;
        } else {
            med = b;
        }
        return med;
    }

    public static void main(String[] args) {
        System.out.println("medEx(10,5,6) = "+medEx(10,5,6));
        System.out.println("medEx(5,6,10) = "+medEx(5,6,10));
        System.out.println("medEx(6,10,5) = "+medEx(6,10,5));

        System.out.println("medEx(3,2,1) = "+medEx(3,2,1));
        System.out.println("medEx(3,2,2) = "+medEx(3,2,2));
        System.out.println("medEx(3,1,2) = "+medEx(3,1,2));
        System.out.println("medEx(3,2,3) = "+medEx(3,2,3));
        System.out.println("medEx(2,1,3) = "+medEx(2,1,3));
        System.out.println("medEx(3,3,2) = "+medEx(3,3,2));
        System.out.println("medEx(3,3,3) = "+medEx(3,3,3));
        System.out.println("medEx(2,2,3) = "+medEx(2,2,3));
        System.out.println("medEx(2,3,1) = "+medEx(2,3,1));
        System.out.println("medEx(2,3,2) = "+medEx(2,3,2));
        System.out.println("medEx(1,3,2) = "+medEx(1,3,2));
        System.out.println("medEx(2,3,3) = "+medEx(2,3,3));
        System.out.println("medEx(1,2,3) = "+medEx(1,2,3));
    }
}
