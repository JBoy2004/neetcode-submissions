class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        
        // hashmap for numbers we've seen
        std::unordered_map<int, int> seenNums;

        //loop through nums 
        for (int i = 0; i < nums.size(); i++) 
        {
            int curNum = nums[i];
            //diff = target - current num
            int diff = target - curNum;

            //if map contains the key, return the two values
            if (seenNums.count(diff))
            {
                return {seenNums[diff], i};
            }
            //if we havent seen it, store the num and move on
            seenNums.insert({curNum, i});
        }
        return {}; //fail case
    }
};
