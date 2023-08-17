package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
    public static void main(String[] args) {
        int min = 1, max = 300;
        List<Integer> list = new ArrayList<>();

        makeList(list, min, max);
        System.out.print("list = " );

        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+", ");
        }
    }


    private static void makeList(List<Integer> list, int min, int max) {
        //1~100까지 비교
        for (int i = min; i <= max; i++) {
            System.out.println("i = " + i);
            boolean isTrue = returnBoolean(i);
            if (isTrue) {
                addList(list, i);
            }
        }
    }

    private static boolean returnBoolean(int i) {

        String num = String.valueOf(i);
        int numLength = num.length() - 1;

        for (int j = 0; j < num.length() / 2; j++, numLength--) {
            System.out.println("num = " + num);
            char numChar = num.charAt(j);
            System.out.println("numChar = " + numChar);
            char numCharOpposite = num.charAt(numLength);
            System.out.println("numCharOpposite = " + numCharOpposite);
            if (numChar != numCharOpposite) {
                return false;
            }
        }
        return true;
    }

    private static void addList(List<Integer> list, int i) {
        list.add(i);
    }

}