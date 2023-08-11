package 프로그래머스;

import 백준.Main;

public class darts {



    public static void main(String[] args) {
        //다트 기회
        int oppertunity = 3;
        //획득 가능 점수
        int score = 0;

        int s=0;
        int d=0;
        int t=0;

        boolean checkedScore = checkScore(score);
//        int single = single(s);
//        int ddouble = ddouble(d);
//        int triple = triple(t);

    }

    //점수 확인하기
    public static boolean checkScore(int score){
        if (score>=0&&score<=10){
            return true;
        }
        return false;
    }

//    public static int single(int s){
//        Math.pow()
//    }
//    public static int ddouble(int d){
//
//    }
//    public int triple(int t){
//
//    }




}
