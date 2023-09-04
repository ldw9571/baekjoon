package 백준;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int M = sc.nextInt();
            int result = 0;

            int Z = M;

            if (N == 1) {
                result = N * M;
            } else {
                for (int j = Z; j >0; j--) {
                    result += (M - N + 1);
                    M--;
                }
            }
            System.out.println("result = " + result);

        }
    }

}
