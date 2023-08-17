package 프로그래머스;

public class AccuseResult {
    public static void main(String[] args) {

        String[] park = new String[3];
        String[] result = new String[3];

        int[] start = new int[2];

        String[] routes = {"E2", "S2", "W1"};

        //park와 routes 값 확인
        allCompare(park, routes);

    }

    private static void allCompare(String[] park, String[] routes) {

        //parkcheck완료
        checkPark(park);
        int[] ints = checkRoutes(routes);
        for (int i : ints) {
            System.out.println("i = " + i);
        }

    }

    private static int[] checkRoutes(String[] routes) {
        //result값 받을 준비
        int[] routeNum = new int[2];
        int i1 = 0;
        int i2 = 0;

        //route string으로 나눔
        for (String route : routes) {

            //숫자확인
            String c1 = String.valueOf(route.charAt(1));
            int c11 = Integer.parseInt(c1);
            System.out.println("2번째숫자 = " + c11);
            //n,s,w,e 확인
            char c = route.charAt(0);
            System.out.println("c = " + c);
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

        }
        routeNum[0] = i1;
        System.out.println("i1 = " + i1);
        routeNum[1] = i2;
        System.out.println("i2 = " + i2);

        return routeNum;
    }

    private static void checkPark(String[] park) {


    }
}
