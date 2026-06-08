/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> result;
        if (root == nullptr) return result; //edge case: empty tree

        std::queue<TreeNode*> q;

        q.push(root); //start with root node
        
        while(!q.empty()) {
            int levelSize = q.size();
            std::vector<int> curLevelVals;

            //process all nodes for current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode* curNode = q.front();
                q.pop(); //remove it from the queue

                //add its value to current level vector
                curLevelVals.push_back(curNode->val);

                //push its children into the queue for the NEXT level
                if (curNode->left != nullptr) {
                    q.push(curNode->left);
                }
                if (curNode->right != nullptr) {
                    q.push(curNode->right);
                }
            }
            //push completed level into result vector
            result.push_back(curLevelVals);
        }
        return result;
    }
};
