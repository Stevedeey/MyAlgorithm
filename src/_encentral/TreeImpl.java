package _encentral;

import java.util.Stack;

public class TreeImpl {
    class TreeNode{
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public  boolean hasSum(TreeNode root, int sum){

            if(root == null) return  false;

            Stack<TreeNode> nodeStack = new Stack<>();
            Stack<Integer> sumStack = new Stack<>();

            nodeStack.add(root);
            sumStack.add(sum - root.value);

            while (!nodeStack.isEmpty()){

                TreeNode currentNode = nodeStack.pop();
                int currentSum =  sumStack.pop();

                if(currentNode.left==null && currentNode.right == null && currentSum == 0){
                    return true;
                }

                if(currentNode.left != null){
                    nodeStack.add(currentNode.left);
                    sumStack.add(currentSum - currentNode.left.value);
                }

                if(currentNode.right != null){

                    nodeStack.add(currentNode.right);
                    sumStack.add(currentSum - currentNode.right.value);
                }

            }
            return false;

        }
    }
}
