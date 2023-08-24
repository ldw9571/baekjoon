package 기업코딩테스트;

import java.io.*;

public class Problem02 {
    public static void main(String[] args) throws IOException {

        fileReader();
    }

    private static void fileReader() throws IOException {

        File file = new File("C:/programing/company/data.json");

        try (Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
        }
    }
}