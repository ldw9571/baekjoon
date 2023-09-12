package 프로그래머스;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {

        int n = 3;
        String answer="";
        StringBuffer buffer = new StringBuffer();
        String what = "수";

        for (int i = 0; i < n; i++) {
            buffer.append(what);
            if(what.equals("수")){
                what="박";
            }else {
                what="수";
            }
        }
        answer=buffer.toString();
        System.out.println("answer = " + answer);
    }
}
