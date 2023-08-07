import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //누가 파티에 왔나
        //몇명이 왔나
        //정확히 알수는 없다

        //1제곱미터당 몇명의 사람이 왔는지 알고 있다

        //서로 다른 5개의 신문에 참가자 적혀있음


        //신문 기사에 실려있는 참가자의 수가 몇명만큼 잘못되어 있는지 구하기

        //1제곱미터당 사람의 수
        int countBy1Square = 5;
        //파티가 열렸던 곳의 넓이
        int squareByParty =20;

        //기사 참가자수 5
        int article1 = 99;
        int article2 = 101;
        int article3 = 1000;
        int article4 = 0;
        int article5 = 97;

        //기사 참가자수 list에 담아줌
        List<Integer> integers = articleCount(article1, article2, article3, article4, article5);

        //상근이가 생각하는 사람의 수
        int countbySangguen = countbySangguen(countBy1Square, squareByParty);

        //상근이가 생각하는 사람의 수 - 기사에 실려있는 참가자의 수
        List<Integer> variances = variances(countbySangguen, integers);

        int i = 1;
        for (Integer variance : variances) {
            System.out.println("상근 - 기사"+i+" 차이 = " + variance);
            i++;
        }
    }




    //파티 넓이 조건

    //상근이가 생각하는 사람의 수
    public static int countbySangguen(int countBy1Square,int squareByParty){
        int countBySangguen;

        //인원수 조건 확인
        boolean trueByPeople = conditionBySquareBypeople(countBy1Square);
        //파티 면적 조건 확인
        boolean trueByParty = conditionBySquareByparty(squareByParty);

        if(trueByPeople&&trueByParty) {
            countBySangguen = countBy1Square * squareByParty;
            return countBySangguen;
        }
        System.out.println("사람수 파티 면적 입력 오류");
        return 0;
    }

    //사람수 조건
    public static boolean conditionBySquareBypeople(int countBy1Square){
        if(countBy1Square>=1&&countBy1Square<=10){
            return true;
        }
        System.out.println("인원수를 정확히 입력해주세요");
        return false;
    }
    //파티 넓이 조건
    public static boolean conditionBySquareByparty(int squareByParty){
        if(squareByParty>=1&&squareByParty<=1000){
            return true;
        }
        System.out.println("파티의 넓이를 정확하게 입력해주세요");
        return false;
    }

    //조건에 맞는 5개의 기사 갯수 list
    public static List<Integer> articleCount(int article1,int article2,int article3,int article4,int article5){
        List countByPeopleByArticle = new ArrayList<>();

        countByPeopleByArticle.add(article1);
        countByPeopleByArticle.add(article2);
        countByPeopleByArticle.add(article3);
        countByPeopleByArticle.add(article4);
        countByPeopleByArticle.add(article5);

        return countByPeopleByArticle;
    }

    //기사 - 상근 구하기
    public static List<Integer> variances(int countbySangguen, List<Integer> integers){
        List variances = new ArrayList<>();

        for (Integer integer : integers){
            int variance = integer - countbySangguen;
//            int abs = Math.abs(variance);
            variances.add(variance);
        }

        return variances;
    }

}