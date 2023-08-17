package 프로그래머스;

public class WalkingPark {

    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o','s','d','a','s','q','q','d'};

        char change;
        int length = charArray.length;

        for (int i = 0; i < length/2; i++,length--) {
            change = charArray[i];
            charArray[i]=charArray[length-1];
            charArray[length-1]=change;
        }

        for (char cha:charArray) {
            System.out.print(cha);
        }
    }
}
