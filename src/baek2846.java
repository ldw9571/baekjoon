import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class baek2846 {
    public static void main(String[] args) {

        //수열의 크기
        int N = 8;
        // N개의 양의정수
        int pi1 = 12, pi2 = 100, pi3 = 1, pi4 = 2, pi5 = 24,pi6 = 68,pi7 = 1,pi8 = 2;
        List<Integer> integers = addList(pi1, pi2, pi3, pi4, pi5,pi6,pi7,pi8);
        boolean b = conditionN(N);
        System.out.println("b = " + b);
        boolean b1 = conditionPi(integers);
        System.out.println("b1 = " + b1);

        if (b && b1) {
            int algorigm = algorigm(N, integers);
            System.out.println("가장 높은 오르막길 = " + algorigm);

        }
    }

    //수열의 크기 제한
    private static boolean conditionN(int N) {
        if (N >= 1 && N <= 1000) {
            return true;
        }
        return false;
    }

    //양의정수 제한
    private static boolean conditionPi(List<Integer> N) {
        for (int Ns : N) {
            if (Ns >= 1 && Ns <= 1000) {
                return true;
            }
        }
        return false;
    }

    //양의정수 배열로 만들기
    private static List<Integer> addList(int pi1, int pi2, int pi3, int pi4, int pi5, int pi6, int pi7, int pi8) {
        List<Integer> addList = new ArrayList<>();
        addList.add(pi1);
        addList.add(pi2);
        addList.add(pi3);
        addList.add(pi4);
        addList.add(pi5);
        addList.add(pi6);
        addList.add(pi7);
        addList.add(pi8);

        return addList;


    }

    //오르막길 구하는 알고리즘
    private static int algorigm(int N, List<Integer> integers) {

        int minusValue = minusValue(integers);

        return minusValue;
    }


    private static int minusValue(List<Integer> list) {

        List<Integer> returnValue = new ArrayList<>();
        int startValue = 0;

        for (int i = 1; i < list.size(); i++) {
            Integer integer = list.get(startValue);

            int minValue = list.get(i - 1);

            int maxValue = list.get(i);

            if ((maxValue < minValue)) {
                int minusValue = minValue - integer;
                startValue = i;
                returnValue.add(minusValue);

            }

        }

        int i = maxValue(returnValue);
        return i;

    }

    private static int maxValue(List<Integer> distinctsList) {
        //값 구하기

        IntSummaryStatistics intSummaryStatistics = distinctsList.stream().mapToInt(Integer::intValue).summaryStatistics();
        int max = intSummaryStatistics.getMax();
        return max;


    }



}


