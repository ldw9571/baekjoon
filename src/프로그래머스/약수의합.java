package 프로그래머스;

public class 약수의합 {
    public static void main(String[] args) {
        int answer = 0;
        int n=5;

        for (int i = 1; i <=n ; i++) {

            int resultNum = n/i;
            if(n%i==0){
                answer+=resultNum;
            }
        }

        System.out.println(answer);
    }
}
