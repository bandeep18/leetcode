class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 1;
        int counter1 = 0;
        int counter2 = 0;
        for (int i : nums) {
            if (i == candidate1) {
                counter1 += 1;
            } else if (i == candidate2) {
                counter2 += 1;
            } else if (counter1 == 0) {
                candidate1 = i;
                counter1 = 1;
            } else if (counter2 == 0) {
                candidate2 = i;
                counter2 = 1;
            } else {
                counter1 -= 1;
                counter2 -= 1;
            }
        }

        final int can1 = candidate1;
        final int can2 = candidate2;
        long count1 = Arrays.stream(nums).filter(n -> n == can1).count();
        long count2 = Arrays.stream(nums).filter(n -> n == can2).count();
        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3)
            result.add(candidate1);
        if (count2 > nums.length / 3 && candidate1 != candidate2)
            result.add(candidate2);

        return result;

    }
}
