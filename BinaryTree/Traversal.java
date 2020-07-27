package BinaryTree;

import java.util.ArrayList;

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = new BTNode(1);
		//root = null;
		Operations opt = new Operations();
		opt.test1();
		/*
		 * Operations opt = new Operations(); root = opt.insert(1, root); root =
		 * opt.insert(2, root); root = opt.insert(3, root); root = opt.insert(4, root);
		 * root = opt.insert(5, root); root = opt.insert(6, root); root = opt.insert(7,
		 * root);
		 */
		
		/*
		 * root.left = new BTNode(2); root.right = new BTNode(3); root.left.left = new
		 * BTNode(4); root.left.right = new BTNode(5); root.right.left = new BTNode(6);
		 * root.right.right = new BTNode(7);
		 */
		
		//opt.inorder(root);
		//opt.preorder(root);
		//opt.postorder(root);
		/*
		 * NonRecursive nr = new NonRecursive(); ArrayList<ArrayList<Integer>> res = new
		 * ArrayList<ArrayList<Integer>>(); nr.levelorder(root, res); for(int
		 * i=0;i<res.size();i++) { //System.out.println("--> "+res.get(i)); }
		 */
	}

}
