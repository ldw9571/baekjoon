public class Problem01 {

    public static void main(String[] args) {
        int[] numbers = {11, 6, 10, 0};

        String s = solution1(numbers);
    }


    public static String solution1(int[] numbers) {
        int first = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            changeChar(first, numbers[i]);
        }
        return "";
    }

    private static String changeChar(int first, int last) {
        String f = String.valueOf(first);
        String l = String.valueOf(last);
        int lengthF = f.length();
        int lengthL = l.length();
        int min = Math.min(lengthF, lengthL);
        if(lengthF==lengthL){
            for (int i = 0; i < lengthF; i++) {
                String ss = f.charAt(i) > l.charAt(i) ? f : l;
                return ss;
            }
        }else {
            for (int i = 0; i < min; i++) {
                String ss = f.charAt(i) > l.charAt(i) ? f : l;
                return ss;
            }

        }
        return "";

    }
}