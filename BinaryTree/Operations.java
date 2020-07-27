package BinaryTree;

public class Operations {
	public void test1() {
		int a[] = new int [1];
		a[0]=1;
		test2(a);
		System.out.println(a[0]);
	}
	private void test2(int[] a) {
		// TODO Auto-generated method stub
		a[0]=4;
	}
	public BTNode insert(int val, BTNode root) {
		if(root==null) {
			root = new BTNode(val);
			return root;
		}
		if(val<root.data) {
			root.left = insert(val,root.left);
		}
		else if(val>root.data) {
			root.right = insert(val,root.right);
		}
		return root;
	}
	
	public void inorder(BTNode root) {
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public void preorder(BTNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder(BTNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + ", ");
	}

}
