public class MaxSubArraysumPrefix {
    public static int maxSubsumPre(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        // Calculate prefix sums and store them in the prefix array
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        // Find the maximum subarray sum using the prefix sum technique
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = prefix[j]-(i > 0 ? prefix[i-1] : 0);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        System.out.println(maxSubsumPre(num)); // Output: 8
    }
}
