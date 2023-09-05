package 프로그래머스;

public class 자릿수더하기 {
    public static void main(String[] args) {
        int n =987;
        int answer = 0;

        String stringValue = String.valueOf(n);
        int length = stringValue.length();

        for (int i = 0; i < length; i++) {
            answer+=stringValue.charAt(i)-48;

        }
        System.out.println("answer = " + answer);

    }
}
