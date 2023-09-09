package 프로그래머스;

import java.util.Arrays;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {20,10,5,1,6,4,8,9};
        int divisor = 5;
        int resultLength=0;

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int i1 = arr[i];
            if(i1%divisor==0){
                resultLength++;
            }
        }

        int[] answer = new int[resultLength];

        resultLength=0;
        for (int i = 0; i < length; i++) {
            int i1 = arr[i];
            if(i1%divisor==0){
                answer[resultLength]=i1;
                resultLength++;
                }
            }
        if (resultLength==0){
            answer = new int[1];
            answer[0]=-1;
        }
        String string1 = Arrays.toString(answer);
        System.out.println("sort전 = " + string1);


        Arrays.sort(answer);



        String string = Arrays.toString(answer);
        System.out.println("sort후 = " + string);
    }
}
