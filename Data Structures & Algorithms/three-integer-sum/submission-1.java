class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //sort so we don't get duplicate solutions

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            if (i > 0 && a == nums[i - 1]) { //skip if we're reusing a value
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int threeSum = a + nums[l] + nums[r];
                if (threeSum > 0) {
                    r--;
                } else if (threeSum < 0) {
                    l++;
                } else {
                    //sum is equal to 0 so add to solution list and break
                    result.add(Arrays.asList(a, nums[l], nums[r]));

                    l++; //move on to check for more solutions with the same a value, keep incr. to avoid duplicate
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                }
            }
        }
        return result;
    }
}
