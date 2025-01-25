import java.util.*;

public class MaxArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        int R = scanner.nextInt();
        int C = scanner.nextInt();

  
        int[][] A = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

       
        int[][] prefixSum = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                prefixSum[i][j] = A[i - 1][j - 1]
                        + prefixSum[i - 1][j]
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1];
            }
        }


        int Q = scanner.nextInt();

   
        StringBuilder output = new StringBuilder();
        for (int q = 0; q < Q; q++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int K = scanner.nextInt();

            
            X++;
            Y++;

            
            int low = 0, high = Math.min(R, C) / 2, result = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (canFormSquare(X, Y, mid, K, prefixSum, R, C)) {
                    result = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            
            output.append((2 * result + 1) * (2 * result + 1)).append("\n");
        }

      
        System.out.print(output);

        scanner.close();
    }

    private static boolean canFormSquare(int x, int y, int size, int k, int[][] prefixSum, int R, int C) {
       
        int top = x - size;
        int left = y - size;
        int bottom = x + size;
        int right = y + size;

       
        if (top < 1 || left < 1 || bottom > R || right > C) {
            return false;
        }

        int blackCells = prefixSum[bottom][right]
                - prefixSum[top - 1][right]
                - prefixSum[bottom][left - 1]
                + prefixSum[top - 1][left - 1];

        return blackCells <= k;
    }
}


