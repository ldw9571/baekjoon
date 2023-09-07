package 기업코딩테스트;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        long result = 0;

        //input의 길이
        int length = input.length();

        //입력받은 문자열을 한자리씩 정수로 바꿔 result 변수에 +
        //ex) 312 -> 3*100 + 1*10 + 2*1

        double pow1 = Math.pow(10, length - 1);

        for (int i = 0; i < length; i++) {

            //문자 정수로 변환
            int in = (int) input.charAt(i) - 48;

            result += in * pow1;

            pow1 = pow1 / 10;
        }
        System.out.println("result = " + result);

    }
}
