package 프로그래머스;

public class 짝수와홀수 {
    public static void main(String[] args) {
        String answer = "";
        StringBuffer buffer = new StringBuffer();
        int num = 3;

        if (num % 2 == 0) {
            buffer.append("Even");
        }else {
            buffer.append("Odd");
        }

        answer = buffer.toString();
        System.out.println("answer = " + answer);
    }
}
