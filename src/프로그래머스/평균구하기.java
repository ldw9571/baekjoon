package 프로그래머스;

public class 평균구하기 {
    public static void main(String[] args) {
    double answer = 0;

    int[] arr={1,2,3,4};
        int length = arr.length;


        for (int i = 0; i < length; i++) {
            double num = arr[i];
            double slash = num / length;
            System.out.println("num = " + num);
            answer+=slash ;
        }

        System.out.println("answer = " + answer);

    }
}
