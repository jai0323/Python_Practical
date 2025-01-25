import java.util.Arrays;
import java.util.Scanner;

public class SpecialTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int n = h * (h + 1) / 2;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (SpecialTriangle(arr, h)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    private static boolean SpecialTriangle(int[] arr, int h) {
        
        Arrays.sort(arr);

        
        int index = 0;
        int[][] triangle = new int[h][];
        for (int i = 0; i < h; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = arr[index++];
            }
        }

        
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (!(triangle[i][j] < triangle[i + 1][j] && triangle[i][j] < triangle[i + 1][j + 1])) {
                    return false;
                }
            }
        }

        return true;
    }
}
