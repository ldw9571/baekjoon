package 프로그래머스;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        int answer=0;

        for (int i = left; i <= right; i++) {
            int num = 0;

            for (int j = 1; j <=right; j++) {
                if(i%j==0){
                    ++num;
                }
            }
            System.out.println("num = " + num);
            if(num%2==0){
                answer=answer+i;
            }else {
                answer=answer-i;
            }
        }

        System.out.println("answer = " + answer);
    }
}
