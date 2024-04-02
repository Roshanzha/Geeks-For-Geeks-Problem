class Solution
{
    public:
    int rightMost(Node* root){
        if(!root->right) return root->data;
        return rightMost(root->right);
    }
    int leftMost(Node* root){
        if(!root->left) return root->data;
        return leftMost(root->left);
    }
    int fun(Node* root){
        if(!root) return 1e9;
        int rc = 1e9, lc = 1e9;
        if(root->left) lc = root->data - rightMost(root->left); 
        if(root->right)  rc = leftMost(root->right) - root->data ;
        int left = fun(root->left);
        int right = fun(root->right);
        return min({left, right, lc , rc});
    }
    int absolute_diff(Node *root)
    {
        //Your code here
        return fun(root);
    }
};
