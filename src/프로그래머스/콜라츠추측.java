package 프로그래머스;

public class 콜라츠추측 {
    public static void main(String[] args) {
        int answer = 0;
        int num = 6;
        boolean isTrue = true;

        while (isTrue==true) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            answer++;
            if (answer>=500){
                answer=-1;
                isTrue=false;
            }

            if(num==1){
                isTrue=false;
            }
        }
        System.out.println("answer = " + answer);

    }

}
