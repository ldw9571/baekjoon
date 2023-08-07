import java.util.ArrayList;
import java.util.List;

public class baek2846 {
    public static void main(String[] args) {

        //수열의 크기
        int N = 0;
        // N개의 양의정수
        int pi1 = 0, pi2 = 0, pi3 = 0, pi4 = 0, pi5 = 0;
        List<Integer> integers = addList(pi1, pi2, pi3, pi4, pi5);
        boolean b = conditionN(N);
        boolean b1 = conditionPi(integers);
        algorigm(N,integers);
        System.out.println("integers = " + integers.size());

    }

    //수열의 크기 제한
    public static boolean conditionN(int N) {
        if (N >= 1 && N <= 1000) {
            return true;
        }
        return false;
    }

    //양의정수 제한
    public static boolean conditionPi(List<Integer> N) {
        for (int Ns : N) {
            if (Ns >= 1 && Ns <= 1000) {
                return true;
            }
        }
        return false;
    }

    //양의정수 배열로 만들기
    public static List<Integer> addList(int pi1, int pi2, int pi3, int pi4, int pi5) {
        List<Integer> addList = new ArrayList<>();
        addList.add(pi1);
        addList.add(pi2);
        addList.add(pi3);
        addList.add(pi4);
        addList.add(pi5);
        return addList;
    }

    //오르막길 구하는 알고리즘
    public static boolean algorigm(int N,List<Integer> integers){

        for (int i = 0; i <integers.size()-1; i++) {
            Integer integer = integers.get(i);
            Integer integer1 = integers.get(i+1);

            if(integer1-integer>0){
                return true;
            }
        }
            return false;
    }

}
