package chap01;

public class Max3Exercise {

    static  int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) {
            max = b;
        }else if(c > max) {
            max = c;
        } else if (d > max) {
            max = d;
        }

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if(min > b) {
            min = b;
        } else if(min > c) {
            min = c;
        }

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        } else if (min > d) {
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println("max4의 최댓값 : "+max4(3,14,2,5));
        System.out.println("min3의 최솟값 : "+min3(20,34,1));
        System.out.println("min4의 최솟값 : "+min4(3,2,10,8));
    }
}
