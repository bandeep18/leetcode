class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    nums = swap(nums, low, mid);
                    low += 1;
                    mid += 1;
                    break;
                case 1:
                    mid += 1;
                    break;
                case 2:
                    nums = swap(nums, mid, high);
                    high--;
                    break;
            }
        }
        return;
    }

    public int[] swap(int[] arr, int to, int from) {
        int temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;
        return arr;
    }
}
