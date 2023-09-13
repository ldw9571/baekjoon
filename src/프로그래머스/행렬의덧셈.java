package 프로그래머스;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        int length = arr1.length;
        int length1 = arr2.length;

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int i1 = arr1[i][j];
                int i2 = arr2[i][j];

                answer[i][j] = i1 + i2;
            }
        }

        for (int[] abc :
                answer) {
            for (int a :
                    abc
            ) {
                System.out.println("a = " + a);

            }
        }

    }
}
