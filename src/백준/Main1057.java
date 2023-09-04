package 백준;


import java.util.Scanner;

//1026번
public class Main1057 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int I = sc.nextInt();

        int result = problem(N, K, I);
        System.out.println("result = " + result);

    }

    private static int problem(int N, int K, int I) {
        int result =0;

        double sqrt = Math.sqrt(N);
        double ceilK = Math.ceil(K/2.0);
        double ceilI = Math.ceil(I/2.0);


        for (int i = 0; i < sqrt; i++) {
            result++;
            System.out.println("result = " + result);
            System.out.println("ceilK = " + ceilK);
            System.out.println("ceilI = " + ceilI);

            if (ceilK + 1 == ceilI) {
                System.out.println("1차 들어옴");
                if (ceilK % 2 == 1 && ceilI % 2 == 0) {
                    System.out.println("2차 들어옴");

                    return result;

                }

            }
            ceilK = Math.ceil(ceilK/2.0);
            ceilI = Math.ceil(ceilI/2.0);


        }
        return -1;
    }
}
