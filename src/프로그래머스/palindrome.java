package 프로그래머스;

import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class palindrome {
    public static void main(String[] args) {
        int min = 100, max = 300;
        List<Integer> list = new ArrayList<>();

        makeList(list,min,max);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = " + list.get(i));
        }


    }


    private static void makeList(List<Integer> list,int min, int max){
        //1~100까지 비교
        for (int i = min; i <= max; i++) {

            boolean isTrue = returnBoolean(i);
            if (isTrue) {
                addList(list,i);
            }
        }
    }

    private static boolean returnBoolean(int i) {

        String num = String.valueOf(i);
//        System.out.println("num = " + num);
        int numLength = num.length()-1;
//        System.out.println("numLength = " + numLength);
        int compareLength = numLength / 2;
//        System.out.println("compareLength = " + compareLength);

        for (int j = 0; j < compareLength; j++, numLength--) {
            char numChar = num.charAt(j);
            char numCharOpposite = num.charAt(numLength);

            if (numChar == numCharOpposite) {
//                System.out.println("numChar = " + numChar);
//                System.out.println("numCharOpposite = " + numCharOpposite);

                return true;
            }


        }
        return false;

    }

    private static void addList(List<Integer> list,int i) {
        list.add(i);
    }





}
