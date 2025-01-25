import java.util.Scanner;

public class ExpressionSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        scanner.close();

        int lhs = 0, rhs = 0; // Sum of constants on the left and right-hand sides
        int sign = 1;         // Current sign (+1 or -1)
        int side = 0;         // 0 for LHS, 1 for RHS
        int xSign = 0;        // Sign of X (+1 or -1)
        int num = 0;          // Temporary number storage
        boolean foundX = false;

        for (char ch : equation.toCharArray()) {
            if (ch == '+') {
                if (foundX) {
                    xSign += sign * (side == 1 ? -1 : 1);
                    foundX = false;
                } else {
                    if (side == 1) rhs += num * sign;
                    else lhs += num * sign;
                }
                num = 0;
                sign = 1;
            } else if (ch == '-') {
                if (foundX) {
                    xSign += sign * (side == 1 ? -1 : 1);
                    foundX = false;
                } else {
                    if (side == 1) rhs += num * sign;
                    else lhs += num * sign;
                }
                num = 0;
                sign = -1;
            } else if (ch == '=') {
                if (foundX) {
                    xSign += sign * (side == 1 ? -1 : 1);
                    foundX = false;
                } else {
                    if (side == 1) rhs += num * sign;
                    else lhs += num * sign;
                }
                num = 0;
                sign = 1;
                side = 1; // Switch to RHS
            } else if (ch == 'X') {
                foundX = true;
            } else {
                num = num * 10 + (ch - '0');
            }
        }

        // Handle the last number or X
        if (foundX) {
            xSign += sign * (side == 1 ? -1 : 1);
        } else {
            if (side == 1) rhs += num * sign;
            else lhs += num * sign;
        }

        // Calculate X
        int result = rhs - lhs;
        if (xSign != 0) {
            System.out.println(result / xSign);
        }
    }
}