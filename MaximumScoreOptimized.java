import java.util.*;

public class MaximumScoreOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        StringBuilder result = new StringBuilder();
        
        while (T-- > 0) {
            int N = scanner.nextInt(); 
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int K = scanner.nextInt(); 
            result.append(solve(arr, N, K)).append("\n");
        }
        
        System.out.print(result);
        scanner.close();
    }
    
    private static int solve(int[] arr, int N, int K) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] dp = new int[N];
        
        dp[0] = arr[0];
        deque.add(0);
        
        for (int i = 1; i < N; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - K) {
                deque.pollFirst();
            }
            
            dp[i] = dp[deque.peekFirst()] + arr[i];
            
            while (!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]) {
                deque.pollLast();
            }
            
            deque.addLast(i);
        }
        
        return dp[N - 1]; 
    }
}
