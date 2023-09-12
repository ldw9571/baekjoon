package 프로그래머스;

public class 내적 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={-3,-1,0,2};

        int answer = 0;

        int length = a.length;
        for (int i = 0; i < length; i++) {
            int i1 = a[i];
            int i2 = b[i];
            int result = i1 * i2;

            answer+=result;
        }
        System.out.println("answer = " + answer);
    }
}
