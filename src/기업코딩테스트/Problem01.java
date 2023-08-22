import java.util.Arrays;

public class Problem01 {

    public static void main(String[] args) {
//        int[] numbers = {3,30,5,34,9,1};
        int[] numbers = {11,6,10,0};

//        for (int i = 0; i < numbers.length; i++) {
        String s = solution1(numbers);
        System.out.println("result= " + s);
//        }



    }


    public static String solution1(int[] numbers) {
        String str = "";
        int[] result = new int[numbers.length-1];
        //배열 수만큼 동작

        for (int j = 0; j < result.length; j++) {
            System.out.println("numbers = " + j);
            int first = numbers[0];
            StringBuffer buffer = new StringBuffer();


            int li = 0;
            for (int i = 1; i < numbers.length; i++) {
                int number = numbers[i];
                System.out.println("numbersw2222222222 = " + i);

//                System.out.println("first = " + first);
//                System.out.println("number = " + number);
                String s = changeChar(first, number);
                first=Integer.parseInt(s);
                li = Integer.parseInt(s);
//                System.out.println("s = "+ s);
//                System.out.println("--------------");
            }
            StringBuffer append = buffer.append(li);
            str += String.valueOf(append);
//            System.out.println("들어가는값 = " + str);
            numbers = removeElement(numbers, li);

        }


        str += String.valueOf(numbers[0]);



        return str;

    }

    private static String changeChar(int first, int last) {

        //int -> string 으로 변환
        String firstValue = String.valueOf(first);
        String compareValue = String.valueOf(last);
//        System.out.println("firstValue = " + firstValue);
//        System.out.println("compareValue = " + compareValue);
//        System.out.println("=----------------------");

        //길이 확인
        int lengthF = firstValue.length();
        int lengthL = compareValue.length();

        //길이 짧은 수 구하기
        boolean b = checkMin(lengthF, lengthL);


        if (firstValue.charAt(0) == compareValue.charAt(0)) {
            if (b) {
                if (compareValue.charAt(1) > compareValue.charAt(0)) {
                    return firstValue;
                } else {
//                    System.out.println("compareValue = " + compareValue);
                    return compareValue;
                }
            } else {
                if (firstValue.charAt(1) > firstValue.charAt(0)) {
                    return firstValue;
                } else {
                    return compareValue;
                }

            }

        }else if (firstValue.charAt(0) < compareValue.charAt(0)) {
            return firstValue;
        }  else {
            return compareValue;
        }
    }

    private static boolean checkMin(int lengthF, int lengthL) {
        int min = Math.min(lengthF, lengthL);
        if(min==lengthF){
            return true;
        }
        return false;

    }

    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
}