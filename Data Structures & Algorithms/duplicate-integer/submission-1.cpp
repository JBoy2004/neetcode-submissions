class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::unordered_set<int> seenNums;

        for (int num : nums) {
            if (!seenNums.insert(num).second) {
                return true;
            }
        }
        return false;
    }
};
