package 프로그래머스;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        int price = 3,money = 20,count=4;
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer+=price*i;
        }
        answer= answer-money;
        System.out.println("answer = " + answer);

    }
}
