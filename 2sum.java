class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        return IntStream.range(0, nums.length).filter(t -> {
            Integer compliement = map.get(new Integer(target - nums[t]));
            if (compliement != null) {
                return true;
            } else {
                map.put(nums[t], t);
            }
            return false;
        }).mapToObj(t -> new int[] { t, map.get(new Integer(target - nums[t])) }).findFirst().orElse(new int[0]);
    }
}
