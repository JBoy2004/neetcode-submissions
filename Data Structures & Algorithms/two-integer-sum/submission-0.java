class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            int diff = target - curNum;
            
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }
            prevMap.put(curNum, i);
        }
        return null;
    }
}
