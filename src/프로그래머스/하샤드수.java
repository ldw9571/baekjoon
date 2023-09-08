package 프로그래머스;

public class 하샤드수 {
    public static void main(String[] args) {
        boolean answer = true;
        int x = 12;
        int copy = x;
        int result =0;

        int length = (int)Math.log10(x);
        System.out.println("length = " + length);

        for (int i =length; i >=0; i--) {

            int pow = (int)Math.pow(10, i);
            System.out.println("pow = " + pow);

            int v = copy / pow;
            copy= copy-pow*v;
            System.out.println("copy = " + copy);
            System.out.println("v = " + v);
            result+=v;
        }

        if(x%result!=0){
            answer=false;
        }

    }
}
