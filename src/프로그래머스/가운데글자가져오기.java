package 프로그래머스;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";
        StringBuffer buffer = new StringBuffer();

        int length = s.length();

        int i1 = length / 2;


            if (length % 2 == 0) {
                buffer.append(s.charAt(i1-1));
                buffer.append(s.charAt(i1));
            } else {
                buffer.append(s.charAt((i1)));
            }

            answer=buffer.toString();
        System.out.println("answer = " + answer);
    }
}
