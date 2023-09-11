package 프로그래머스;

public class 음향더하기 {
    public static void main(String[] args) {

        int answer = 0;

        int[] absolutes = {4,7,12};
        int length = absolutes.length;

        boolean[] signs = {true,false,true};



        for (int i = 0; i < length; i++) {
            int absolute = absolutes[i];
            boolean sign = signs[i];

            System.out.println("absolute = " + absolute);
            System.out.println("sign = " + sign);

            if (sign==false){
                int i1 = absolute * -1;
                answer=answer+i1;
            }else {
                answer = answer + absolute;
            }
        }


    }
}
