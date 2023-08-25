package 기업코딩테스트;

import java.io.*;
import java.util.StringTokenizer;


public class Problem02 {
    public static void main(String[] args) throws IOException {

        fileReader();
    }

    private static void fileReader() throws IOException {
        try {


            BufferedReader reader = new BufferedReader(new FileReader("C:/programing/company/data.json"));
            String line;


            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");

                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();

                    System.out.println(token);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}