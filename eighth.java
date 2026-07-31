import java.util.*;

public class eighth {

    // Function to input an array
    static int[] inputArray(Scanner sc, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Function to find sum of middle elements without creating merged array
    static int findMiddleSum(int[] arr1, int[] arr2, int n) {

        int i = 0, j = 0;
        int count = 0;

        int total = 2 * n;
        int mid1 = total / 2 - 1;
        int mid2 = total / 2;

        int firstMiddle = 0;
        int secondMiddle = 0;

        while (i < n && j < n) {

            int current;

            if (arr1[i] <= arr2[j]) {
                current = arr1[i++];
            } else {
                current = arr2[j++];
            }

            if (count == mid1)
                firstMiddle = current;

            if (count == mid2) {
                secondMiddle = current;
                break;
            }

            count++;
        }

        while (count <= mid2 && i < n) {

            if (count == mid1)
                firstMiddle = arr1[i];

            if (count == mid2) {
                secondMiddle = arr1[i];
                break;
            }

            i++;
            count++;
        }

        while (count <= mid2 && j < n) {

            if (count == mid1)
                firstMiddle = arr2[j];

            if (count == mid2) {
                secondMiddle = arr2[j];
                break;
            }

            j++;
            count++;
        }

        return firstMiddle + secondMiddle;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = inputArray(sc, n);
        int[] arr2 = inputArray(sc, n);

        System.out.println(findMiddleSum(arr1, arr2, n));
    }
}