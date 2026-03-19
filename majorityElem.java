class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int elem = nums[0];
        for (int t : nums) {
            if (t == elem) {
                count += 1;
            } else {
                count -= 1;
                if (count <= 0) {
                    elem = t;
                    count = 1;
                }
            }
        }
        ;
        return elem;
    }
}
