import java.util.Scanner;

public class AliceAndCup_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine().trim();
        if (moves.length() > 50) {
            System.out.println("Error: Input must be at most 50 characters.");
            return;
        }
        
        int ballPosition = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'A':
                    if (ballPosition == 0) {
                        ballPosition = 1;
                    } else if (ballPosition == 1) {
                        ballPosition = 0;
                    }
                    break;

                case 'B':
                    if (ballPosition == 1) {
                        ballPosition = 2;
                    } else if (ballPosition == 2) {
                        ballPosition = 1;
                    }
                    break;

                case 'C':
                    if (ballPosition == 0) {
                        ballPosition = 2;
                    } else if (ballPosition == 2) {
                        ballPosition = 0;
                    }
                    break;

                default:
                    break;
            }
        }
        System.out.println(ballPosition + 1);
    }
}
