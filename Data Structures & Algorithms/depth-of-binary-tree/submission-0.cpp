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
    int maxDepth(TreeNode* root) {
        //edge case
        if (root == nullptr) {
            return 0;
        }

        //recursively find depth of both subtrees (because binary, 2)
        int left_depth = maxDepth(root->left);
        int right_depth = maxDepth(root->right);

        //return bigger depth + 1 (for current node)
        return std::max(left_depth, right_depth) + 1;
    }
};
