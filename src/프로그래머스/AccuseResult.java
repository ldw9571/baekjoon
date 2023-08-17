package 프로그래머스;

import java.util.Map;

public class AccuseResult {
    public static void main(String[] args) {


        int[] start = new int[2];

//        String[] routes = {"E2", "S2", "W1"};
        String[] routes = {"E2", "S2", "W1"};
//        String[] routes = {"E2", "S3", "W1"};
//        String[] park = {"SOO", "OOO", "OOO"};
        String[] park = {"SOO", "OXX", "OOO"};
//        String[] park = {"OSO","OOO", "OXO", "OOO"};

        //park와 routes 값 확인
        int[] ints = checkRoutes(routes, park);

        System.out.print("result = [");
        for (int in:ints) {
            System.out.print(in);
        }
        System.out.println("]");

    }


    private static int[] checkRoutes(String[] routes, String[] park) {
        //result값 받을 준비
        int[] routeNum = new int[2];
        int i1=0;
        int i2=0;
        //장애물 = 1
        int[][] ints = checkPark(park, i1, i2);


        //출발점 찾기
        for (int i = 0; i < routes.length; i++) {
            String route = routes[i];



            if (ints[i][1] == 2) {
                i1 = i;
                i2 = i;
            }
        }


        for (int i = 0; i < routes.length; i++) {
            String route = routes[i];
            //숫자확인
            String c1 = String.valueOf(route.charAt(1));
            int c11 = Integer.parseInt(c1);

            if (ints[i][1] != 1) {
                        //n,s,w,e 확인
                        char c = route.charAt(0);
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

                System.out.println("i1 = " + i1);
                System.out.println("i2 = " + i2);
                System.out.println("한바퀴--------------------------------");

            }
        }


        routeNum[0] = i1;
        routeNum[1] = i2;

        return routeNum;
    }

    //장애물 걸러내기
    private static int[][] checkPark(String[] park, int i1, int i2) {

        int[][] bomb = new int[park.length][3];

        for (int i = 0; i < park.length; i++) {

            int start = 0;

            String par = park[i];
            int length = par.length();


            for (int j = 0; j < par.length(); j++) {
                char c = par.charAt(j);

                switch (c) {
                    case 'S':
                        if (j != 0) {
                            bomb[i][j] = 2;
                            start++;
                        }
                        break;
                    case 'X':
                        bomb[i][j] = 1;
                        break;
                    case 'O':
                        bomb[i][j] = 0;
                        break;
                }
            }

        }


        return bomb;
    }

}
