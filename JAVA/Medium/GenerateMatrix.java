// LeetCode 59
public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int x = 0;
        int y = 0;
        int i = 0;
        int j = 0;

        int offset = 1;
        int loop = 1;
        int count = 1;

        while (loop <= n / 2) {
            for (j = y; j < n - offset; j++) {
                res[x][j] = count;
                count++;
            }

            for (i = x; i < n - offset; i++) {
                res[i][j] = count;
                count++;
            }

            for (; j > y; j--) {
                res[i][j] = count;
                count++;
            }

            for (; i > x; i--) {
                res[i][j] = count;
                count++;
            }
            x++;
            y++;
            offset++;
            loop++;
        }

        if (n % 2 == 1) {
            res[x][y] = count;
        }
        return res;
    }
}
