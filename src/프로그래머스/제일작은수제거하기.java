package 프로그래머스;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {10};

        int length = arr.length;
        int[] answer = new int[length-1];

        if(length==1){
            answer = new int[length];
        }

        int j=0;

        for (int i = 0; i < length-1; i++) {
            int before = arr[i];
            for (j = i; j < length; j++) {

                int after = arr[j];

                if (before < after) {
                    before = after;
                }

            }

            answer[i]=before;
        }
        if(answer.length==1){
            answer[0]=-1;
        }



        for (int an:answer) {
            System.out.println("an = " + an);
        }

    }
}
