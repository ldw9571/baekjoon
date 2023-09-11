package 프로그래머스;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {

        String answer = "";
        String phone_number = "01033334444";
        StringBuffer buffer = new StringBuffer();

        int length = phone_number.length();
        System.out.println("length = " + length);
        length=length-4;
        System.out.println("length = " + length);

        for (int i = 0; i < length; i++) {
           buffer.append('*');
        }

        for (int i = length; i <length+4 ; i++) {
            char c = phone_number.charAt(i);
           buffer.append(c);

        }

        answer = buffer.toString();

        System.out.println("answer = " + answer);
    }
}
