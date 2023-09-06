package 프로그래머스;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        long answer = 0;

        long n = 121;

        double sqrt = Math.sqrt(n);
        double result = sqrt / 1.0;

        if(result%1==0){
            double sqrtPlus = sqrt + 1;
            System.out.println("sqrtPlus = " + sqrtPlus);
            double pow = Math.pow(sqrtPlus, 2);
            System.out.println("pow = " + pow);
            answer=(long)pow;
            System.out.println("answer = " + answer);

        }else {
            answer=-1;
        }
    }
}
