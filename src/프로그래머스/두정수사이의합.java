package 프로그래머스;

public class 두정수사이의합 {
    public static void main(String[] args) {

        long answer = 0;
        int a = 3;
        int b = 5;

        if (a>b){
            for (int i = a; i >= b ; i--) {
                answer+=i;

            }
        }else if(a<b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }else {
            answer=a;
        }

    }
}
