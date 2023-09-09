package 프로그래머스;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] seoul) {
        int result = 0;

        seoul= new String[]{"Jane", "KimKim","asdas","Kim"};

        int length = seoul.length;

        for (int i = 0; i < length; i++) {
            String arg = seoul[i];
            System.out.println("arg = " + arg);
            result=result+1;

            if(arg.equals("Kim")) {
                String answer = "김서방은"+result+"에 있다";

                System.out.println("answer = " + answer);
            }

        }


    }
}
