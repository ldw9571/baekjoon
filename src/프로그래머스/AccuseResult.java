package 프로그래머스;

import java.util.Map;

public class AccuseResult {
    public static void main(String[] args) {


        int[] start = new int[2];

        String[] routes = {"E2", "S2", "W1"};
        String[] park = {"SOO", "OXX", "OOO"};

        //park와 routes 값 확인
        checkRoutes(routes, park);

    }


    private static int[] checkRoutes(String[] routes, String[] park) {
        //result값 받을 준비
        int[] routeNum = new int[2];
        int i1 = 0;
        int i2 = 0;

        //route string으로 나눔
        for (String route : routes) {

            //숫자확인
            String c1 = String.valueOf(route.charAt(1));
            int c11 = Integer.parseInt(c1);
//            System.out.println("2번째숫자 = " + c11);
            //n,s,w,e 확인
            char c = route.charAt(0);
//            System.out.println("c = " + c);
            switch (c) {
                case 'N':
                    i1 = i1 - c11;
                    break;
                case 'S':
                    i1 = i1 + c11;
                    break;
                case 'W':
                    i2 = i2 - c11;
                    break;
                case 'E':
                    i2 = i2 + c11;
                    break;
            }


            checkPark(park, i1, i2);


        }
        routeNum[0] = i1;
        routeNum[1] = i2;

        return routeNum;
    }

    private static void checkPark(String[] park, int i1, int i2) {
        System.out.println("남북 = " + i1);
        System.out.println("동서 = " + i2);
        int start = 0;

        int[][] bomb = new int[][]{new int[3]};

        for (int i = 0; i < park.length ; i++) {

            String par = park[i];
//            System.out.println("par = " + par);


            for (int j = 0; j < par.length(); j++) {
                char c = par.charAt(j);
//                System.out.println("c = " + c);

                switch (c) {
                    case 'S':
                        if (j != 0) {
                            start++;
                        }
                        break;
                    case 'X':
                        bomb[i][j]=1;
                        break;
                    case 'O':
                        bomb[i][j]=0;
                        break;
                }
            }

        }


    }

    private static void checkSwitch(char c) {
    }
}
