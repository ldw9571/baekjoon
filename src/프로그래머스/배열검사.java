package 프로그래머스;

public class 배열검사 {
    public static void main(String[] args) {

        int[] in = new int[4];

        in[0]=1;
        in[1]=2;
        in[2]=3;

        for (int i :
                in) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }


    }
}
