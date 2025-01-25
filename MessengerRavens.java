import java.util.Scanner;

public class MessengerRavens {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long MOD = 1_000_000_007;

        long M = sc.nextLong(); 
        int N = sc.nextInt();  

        if (M < 1 || M > 1_000_000_000_000_000_000L) {
            System.out.println("Error: M must be between 1 and 10^18.");
            return;
        }
        if (N < 1 || N > 1_000_000) {
            System.out.println("Error: N must be between 1 and 10^6.");
            return;
        }

        long R = 0;
        for (int i = 0; i < N; i++) {
            long D = sc.nextLong();
            if (D < 1 || D >= (1L << 44)) {
                System.out.println("Error: Each difficulty value must be between 1 and 2^44 - 1.");
                return;
            }
            R ^= D;
        }

        long T = (M % 2 == 1) ? R : 0;

        System.out.println(T % MOD);

    }
}
