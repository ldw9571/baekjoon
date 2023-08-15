package 프로그래머스;

import 백준.Main;

public class darts {


    public static void main(String[] args) {
        //다트 기회
        int oppertunity = 3;
        //획득 가능 점수

        String dartResult = "1S2D*3T";
        for (int i = 0; i < dartResult.length(); i++) {
            //아스키코드
            int intDartResult = (int) dartResult.charAt(i);

            //숫자 추출, checkedScore가 true 면 숫자
            int score = resultScore(intDartResult);
            boolean checkedScore = checkScore(score);

            //sdt 점수 주기
            sdt(intDartResult);

        }


    }

    private static int sdt(int intDartResult) {
        //s83 , d68, t54
        int squared = 0;

        if (intDartResult == 83) {
            squared = 1;
        }

        if (intDartResult == 83) {
            squared = 2;
        }

        if (intDartResult == 83) {
            squared = 3;
        }

        return squared;
    }

    private static int resultScore(int intDartResult) {
        if (intDartResult >= 48 && intDartResult <= 57) {
            char intDartResult1 = (char) intDartResult;
            int intResult = Integer.parseInt(String.valueOf(intDartResult1));
            return intResult;
        }

        return 11;
    }

    //점수 확인하기
    public static boolean checkScore(int score) {
        if (score >= 0 && score <= 10) {
            return true;
        }
        return false;
    }


}
