package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        long answer = 0;
        long n = 118372;

        List<Integer> list = new ArrayList<>();

        StringBuffer buffer = new StringBuffer();
        StringBuffer buffer1 = new StringBuffer();

        StringBuffer value = buffer.append(n);

        for (int i = 0; i < value.length() - 1; i++) {
            int biggest = 0;
            System.out.println("value길이 = " + value.length());

            System.out.println("start-----------------------");
            char c = value.charAt(i);
         //   System.out.println((i+1)+"번째 비교 = " + c);

            for (int j = i; j < value.length(); j++) {
                char c1 = value.charAt(j);
//                System.out.println("biggest = " + biggest);

                int integerC1 = c1;
             //   System.out.println("비교하는 숫자"+(integerC1-48));

                if (biggest <= integerC1 - 48) {
                    biggest = integerC1 - 48;
                 //   System.out.println("큰숫자 = " + biggest);
                }

            }

            System.out.println("---한바퀴-----");
            buffer1.append(biggest);

            for (int s = 0; s < value.length(); s++) {
                int c1 = value.charAt(s) - 48;


                if (c1 == biggest) {
                 //   System.out.println("biggest가 몇번쨰인지 찾았다"+s);
                    StringBuffer stringBuffer = value.deleteCharAt(s);
                    System.out.println("stringBuffer = " + stringBuffer);
                    //   System.out.println("value = " + value);
                }
            }
            System.out.println("\n-------------------------------------------"+i+"바퀴");

        }
        String string = buffer1.toString();

        int i = Integer.parseInt(string);

        answer = i;
        System.out.println("answer = " + answer);

    }
}
