package 프로그래머스;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        long n = 12345;
        int length = (int) Math.log10(n) + 1;
        int[] answer = new int[length];

        String s = String.valueOf(n);
        int length1 = s.length();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int result = (int) c - 48;

            answer[length1 - 1] = result;

            length1=length1-1;

        }

        for (int an : answer) {
            System.out.println("an = " + an);
        }

    }
}
