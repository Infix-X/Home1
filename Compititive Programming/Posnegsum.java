import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Posnegsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMaxSum(arr, n);
        System.out.println(result);
    }

    public static int findMaxSum(int[] arr, int n) {
        List<Integer> ans = new ArrayList<>();
        int t = 1;
        if (arr[0] > 0) {
            t = 0;
        }
        int i = 0;
        while (i < n) {
             if (t==0) {
                int j = i;
                while (j < n) {
                    if (arr[j] > 0) {
                        j++;
                    } else {
                        break;
                    }
                }
                ans.add(maxValue(arr, i, j));
                i = j;
                t = 1;
            } else {
                int j = i;
                while (j < n) {
                    if (arr[j] < 0) {
                        j++;
                    } else {
                        break;
                    }
                }
                ans.add(maxValue(arr, i, j));
                i = j;
                t = 0;
            }
        }
        return sumList(ans);
    }

    public static int maxValue(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
