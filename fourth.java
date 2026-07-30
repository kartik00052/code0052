import java.util.*;

public class fourth {

    public static List<Integer> findArmstrong(int a, int b) {

        List<Integer> list = new ArrayList<>();

        for (int i = a; i <= b; i++) {

            int temp = i;
            int sum = 0;

            int digits = String.valueOf(i).length();

            while (temp > 0) {

                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == i) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        System.out.println(findArmstrong(10, 1000));

    }
}