import java.util.Scanner;

public class isJumpingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int X = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int num = 0; num <= X; num++) {
            if (isJumping(num)) {
                sb.append(num).append(" ");
            }
        }

        System.out.println("Jumping Numbers: " + sb.toString().trim());

        sc.close();
    }

    static boolean isJumping(int n) {
        if (n < 10) return true;

        int prevDigit = n % 10;
        n /= 10;

        while (n > 0) {
            int currDigit = n % 10;
            if (Math.abs(prevDigit - currDigit) != 1) {
                return false;
            }
            prevDigit = currDigit;
            n /= 10;
        }
        return true;
    }
}