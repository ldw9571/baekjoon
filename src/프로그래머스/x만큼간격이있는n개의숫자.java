package 프로그래머스;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        long[] answer = new long[n];

        int result=0;

        for (int i = 0; i < n; i++) {
            result=result+x;
            answer[i]=result;

        }

        for (long a : answer) {
            System.out.println("a = " + a);
        }
    }
}
