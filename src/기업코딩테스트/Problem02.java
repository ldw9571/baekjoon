package 기업코딩테스트;

import java.io.*;

public class Problem02 {
    public static void main(String[] args) throws IOException {

        fileReader();
    }

    private static void fileReader() throws IOException {
        File file = new File("C:/programing/data.json");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);

        System.out.println("bufReader = " + bufReader);


    }

    private static String system(String[] lineText) {
        String score = score(lineText);
        String name = name(lineText);
        int length = lineText.length;
        for (int i = 0; i < length; i++) {
            System.out.println("score = " + score);
            System.out.println("name = " + name);

        }
        return score;
    }

    private static String score(String[] lineText) {
        String score = lineText[1];
        return score;
    }

    private static String name(String[] lineText) {
        String name = lineText[2];
        return name;
    }
}
