package 프로그래머스;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,6,7,8,0};
        int answer = 0;

        for (int j = 0; j < 10; j++) {
            boolean isTrue=false;

                for (int i = 0; i < numbers.length; i++) {
                    int number = numbers[i];
                    if(j==number){
                    isTrue=true;
                }

            }

            System.out.println("isTrue = " + isTrue);
            if (isTrue==false){
                System.out.println("j = " + j);
                answer=answer+j;
            }



        }
        System.out.println("answer = " + answer);

    }
}
