package 프로그래머스;

import 백준.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class darts {


    public static void main(String[] args) {
        //다트 기회
        int oppertunity = 3;
        //획득 가능 점수
        int score=0;

        String dartResult = "1S2D3T";
        List<Integer>numbers = new ArrayList<>();
        List<Integer>pows = new ArrayList<>();
        List<Integer>bonus = new ArrayList<>();

        for (int i = 0; i < dartResult.length(); i++) {
            //아스키코드
            int intDartResult = (int) dartResult.charAt(i);

            //숫자 추출, checkedScore가 true 면 숫자
            int number = resultScore(intDartResult);
           // System.out.println("number = " + number);
            boolean checkedScore = checkScore(number);



            if(checkedScore){
                numbers.add(number);
            }

            //sdt 맞나 확인
            int sdt = sdt(intDartResult);
           // System.out.println("sdt = " + sdt);
            boolean sdtIstrue = istrueSdt(intDartResult);


            if (sdtIstrue) {
                //sdt 점수 주기
                pows.add(sdt);

            }


            int doubleOrMinus = checkBonus(intDartResult);
            bonus.add(doubleOrMinus);


        }

        for (int j = 0; j <numbers.size() ; j++) {
            int num = numbers.get(j);
            System.out.println("num = " + num);
            int pow = pows.get(j);
            System.out.println("pow = " + pow);

            int pow1 = (int)Math.pow(num, pow);
            int result;
            Integer bonusInteger = bonus.get(j);
            if(bonusInteger==1){
                result = pow1 * 2;
            } else if (bonusInteger==2) {
                result = score - pow1;
            }else{
                result=pow1;
            }

            System.out.println("result = " + result);

            score+=result;
            System.out.println("score = " + score);

        }

        System.out.println("Lastscore = " + score);


    }

    private static int checkBonus(int intDartResult) {
        //*42, #35
        if(intDartResult==42){
            return 1;
        }

        if (intDartResult==35){
            return 2;
        }
        return 0;

    }

    private static boolean istrueSdt(int intDartResult) {
        if (intDartResult==83||intDartResult==68||intDartResult==84){
            return true;
        }
        return false;

    }

    private static int sdt(int intDartResult) {
        //s83 , d68, t84
        int squared = 0;

        if (intDartResult == 83) {
            squared = 1;
        }

        if (intDartResult == 68) {
            squared = 2;
        }

        if (intDartResult == 84) {
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
