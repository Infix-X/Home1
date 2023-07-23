   int left = 0;
        int right = height.length - 1;
        int maxWaterTrapped = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentWaterTrapped = minHeight * width;
            maxWaterTrapped = Math.max(maxWaterTrapped, currentWaterTrapped);

            // Move the pointer that points to the smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWaterTrapped;
    }
