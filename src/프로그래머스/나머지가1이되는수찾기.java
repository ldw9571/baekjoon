package 프로그래머스;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 12;


        for (int i = 1; i <= n; i++) {
            int checkNum = n % i;
            if (checkNum==1){
                answer=i;
                System.out.println("answer = " + answer);

                System.exit(0);
            }
        }

    }
}
