package 프로그래머스;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "pPoooyY";

        int numP = 0;
        int numY = 0;

        String lowerCase = s.toLowerCase();
        int length = lowerCase.length();


        for (int i = 0; i < length; i++) {
            char c = lowerCase.charAt(i);

            switch (c){
                case 'p' : numP++; break;
                case 'y' : numY++; break;
            }

        }

        if(numP==numY){
            answer=true;
        }else {
            answer=false;
        }


    }
}
