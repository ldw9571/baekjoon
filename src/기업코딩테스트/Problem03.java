package 기업코딩테스트;

import java.util.ArrayList;
import java.util.List;

public class Problem03 {
    public static void main(String[] args) {
        String text = "가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123";
        int n = 20;
        List<String> strings = solution3(text, n);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println("strings.get(i) = " + strings.get(i));
        }


    }

    public static List<String> solution3(String text, int n) {
        //영문 : 97 ~ 122
        //숫자 : 48 ~ 57
        StringBuffer buffer = new StringBuffer();
        List<String> string = new ArrayList<>();

        int total = 0;
        //한글 2 영어숫자 1

        //string 길이
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char compareChar = text.charAt(i);
            int compareInt = compareChar;
            if (compareInt >= 97 && compareInt <= 122) {
                total += 1;
            } else if (compareInt >= 48 && compareInt <= 57) {
                total += 1;
            } else {
                total += 2;
            }
            StringBuffer append = buffer.append(compareChar);

            boolean isTrue = changeString(total, n);
            if (isTrue){
                string.add(append.toString());
            }

        }


        return string;
    }

    //아스키코드 비교해서 글자 숫자범위 확인
    private static boolean changeString(int total,int n) {
        if (total>n){
            return true;
        }
        return false;

    }
}
