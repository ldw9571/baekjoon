import java.util.Arrays;

public class Problem01 {

    public static void main(String[] args) {
        int[] numbers = {3,30,5,34,9,1};
//        int[] numbers = {11,6,10,0};

//        for (int i = 0; i < numbers.length; i++) {
        String s = solution1(numbers);
        System.out.println("result= " + s);
//        }



    }


    public static String solution1(int[] numbers) {
        String str = "";

        for (int j = 0; j <= numbers.length; j++) {

            int first = numbers[0];
            StringBuffer buffer = new StringBuffer();


            //배열 수만큼 동작
            int li = 0;
            for (int i = 1; i < numbers.length; i++) {
                int number = numbers[i];
//                System.out.println("first = " + first);
//                System.out.println("number = " + number);
                String s = changeChar(first, number);
                li = Integer.parseInt(s);
                System.out.println("s = "+ s);
                System.out.println("-------------- = ");
            }
            StringBuffer append = buffer.append(li);
            str += String.valueOf(append);
            System.out.println("str = " + str);
            numbers = removeElement(numbers, li);

        }


        str += String.valueOf(numbers[0]);



        return str;

    }

    private static String changeChar(int first, int last) {

//        System.out.println("first = " + first);
//        System.out.println("last = " + last);
        //int -> string 으로 변환
        String f = String.valueOf(first);
        String l = String.valueOf(last);

        //길이 확인
        int lengthF = f.length();
        int lengthL = l.length();

        //길이 짧은 수 구하기
        int min = Math.min(lengthF, lengthL);

        //비교값 길이 같을 때
        if (lengthF == lengthL) {
            for (int i = 0; i < lengthF; i++) {
                int i1 = f.charAt(i);
                int i2 = l.charAt(i);
                if (i1 != i2) {
                    int min1 = Math.min(i1, i2);
                    if (min1 == i1) {
                        return f;
                    } else {
                        return l;
                    }
                }
            }
        } else {
            for (int i = 0; i < min; i++) {
                int i1 = f.charAt(min - 1);
                int i2 = l.charAt(min - 1);
                int min1 = Math.min(i1, i2);
                if ((char) min1 == f.charAt(0)) {
                    return f;
                } else {
                    return l;
                }
            }

        }
        return "";

    }

    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
}