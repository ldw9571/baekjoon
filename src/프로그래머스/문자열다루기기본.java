package 프로그래머스;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        String s = "1234";
        boolean[] check = {false, false, false, false};
        boolean answer = true;

        int length = s.length();

        //48~57 = 0~9
        if (length == 4 || length == 6) {


            for (int i = 0; i < length; i++) {
                int c = s.charAt(i);
                boolean digit = Character.isDigit(c);

                if(digit==false){
                    answer=false;
                }

            }


            System.out.println("answer = " + answer);

        }
    }
}
