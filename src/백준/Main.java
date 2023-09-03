package 백준;

import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n == 0) {
            System.out.println("return0");
            return 0;
        } else if (n == 1) {
            System.out.println("return1");
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        int zero=0;
        int one=0;

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

                int fibonacci = fibonacci(N);
                System.out.println("fibonacci = " + fibonacci);
                if (fibonacci == 0) {
                    zero = +1;
                } else if (fibonacci == 1) {
                    one = +1;
                }

            System.out.println("zero = " + zero);
            System.out.println("one = " + one);
            zero = 0;
            one = 0;
        }
    }
}
