package 기업코딩테스트;

import java.util.ArrayList;
import java.util.List;

public class Problem03 {
    public static void main(String[] args) {
        String text = "가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123\n";
        int n = 15;
        List<String> strings = solution3(text, n);



        System.out.println(text.length());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("strings.get(i) = " + strings.get(i));
        }


    }

    public static List<String> solution3(String text, int n) {
        //getType시  한글 : 5, 영어: 2, 숫자 : 9
        StringBuffer buffer = new StringBuffer();
        List<String> string = new ArrayList<>();


        int total = 0;
        int addPoint = 0;


        //string 길이
        int length = text.length();

        int[] ints = numberX(total, text, n);
        int quotient = ints[0];
        for (int i = 0; i < length-1; i++) {
            char compareChar = text.charAt(i);
            int type = Character.getType(compareChar);
            switch (type) {
                case 2:
                    addPoint = 1;
                    break;
                case 5:
                    addPoint = 2;
                    break;
                case 9:
                    addPoint = 1;
                    break;
            }
            total = total + addPoint;
            addPoint = 0;
            buffer.append(text.charAt(i));

            int nextPoint = 0;

            int nextNum = Character.getType(text.charAt(i + 1));

            switch (nextNum) {
                case 2:
                    nextPoint = 1;
                    break;
                case 5:
                    nextPoint = 2;
                    break;
                case 9:
                    nextPoint = 1;
                    break;
            }


                if (total + nextPoint > n) {


                    string.add(String.valueOf(buffer));
                    buffer = new StringBuffer();
                    total = 0;
                }

        }

        int stringLength=0;
        for (int i = 0; i < string.size(); i++) {
            String s = string.get(i);
            int length1 = s.length();
            stringLength+=length1;
        }


        //나머지 값들 string에 집어넣기

        buffer = new StringBuffer();
        for (int j = stringLength; j <length ; j++) {
            buffer.append(text.charAt(j));
        }
        string.add(String.valueOf(buffer));

        return string;
    }

    //나머지 몫 구하기
    private static int[] numberX(int total, String text,int n) {
        int length = text.length();
        int[] newInt = new int[2];
        for (int i = 0; i < length; i++) {
            char compareChar = text.charAt(i);
            int type = Character.getType(compareChar);
            switch (type) {
                case 2:
                    total = total + 1;
                    break;
                case 5:
                    total = total + 2;
                    break;
                case 9:
                    total = total + 1;
                    break;

            }
        }
        int quotient = total / n;
        int remainder = total % n;

        newInt[0] = quotient;
        newInt[1] = remainder;
        return newInt;
    }
}
