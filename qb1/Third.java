package qb1;

public class Third {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {10, 20, 30}, {12, 15, 18}, {5, 15, 25}};
        int N = 4, M = 3;
        int sum = 0;

        for (int row = 0; row < N; row++) {
            for (int col = 0; col <= 1; col++) {
                sum += arr[row][col];
            }
        }

        System.out.println(sum);
    }
}
