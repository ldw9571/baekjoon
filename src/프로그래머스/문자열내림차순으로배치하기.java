package 프로그래머스;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {

        String s = "Zbcdefg";
        String answer = "";

        // 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();

        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray);

        char[] reversedArray = new char[charArray.length];

        // 문자 배열을 역순으로 복사
        int j = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedArray[j++] = charArray[i];
        }

        // 역순으로 정렬된 문자 배열을 문자열로 변환
        answer = new String(reversedArray);

        System.out.println("answer = " + answer);
    }
}