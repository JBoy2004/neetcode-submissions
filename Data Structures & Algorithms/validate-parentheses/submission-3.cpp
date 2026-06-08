class Solution {
public:
    bool isValid(string s) {
        std::unordered_map<char, char> closeToOpen = { {')', '('}, {']', '['}, {'}', '{'} };
        std::stack<char> stk;

        for(char c : s) {
            if (closeToOpen.contains(c) && !stk.empty()) { //if it's an closing bracket
                if (stk.top() == closeToOpen[c]) { //if prev char matches the close bracket
                    stk.pop(); //complete the pair and pop the open bracket
                } else {
                    return false; //invalid, fail
                }
            } else {
                stk.push(c); //open bracket, add to stack
            }
        }
        return stk.empty(); //if empty, all pairs have been completed; pass
    }
};
