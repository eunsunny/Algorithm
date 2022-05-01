package chap01;

import java.util.Scanner;

public class Median {
    // 3개의 정수값을 입력하고 중앙값을 구한 다음 출력한다.
    static int med3(int a, int b, int c) {
        if(a >= b) {
            if(b >= c) {
                return b;
            }else if (a <= c) {
                return a;
            }else{
                return c;
            }
        }else if (a > c) {
            return a;
        }else if (b > c) {
            return c;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세정수의 중앙 값을 구합니다.");
        System.out.println("a 의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b 의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c 의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 "+med3(a, b, c)+" 입니다.");
    }
}
