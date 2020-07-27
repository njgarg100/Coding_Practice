package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NonRecursive {
	
	public ArrayList<Integer> preorder(BTNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root==null) {
			return res;
		}
		Stack<BTNode> s = new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			BTNode temp = s.pop();
			res.add(temp.data);
			if(temp.right!=null) {
				s.push(temp.right);
			}
			if(temp.left!=null) {
				s.push(temp.left);
			}
		}
		
		return res;
	}
	
	public ArrayList<Integer> inorder(BTNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root==null) return res;
		Stack<BTNode> s = new Stack<BTNode>();
		BTNode curr = root;		
		boolean done = false;
		while(!done) {
			if(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}
			else {
				if(s.isEmpty()) {
					done = true;
				}
				else {
					curr = s.pop();
					res.add(curr.data);
					curr = curr.right;
				}
			}
		}		
		return res;
	}
	
	public ArrayList<Integer> postorder(BTNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root==null) return res;
		Stack<BTNode> s = new Stack<BTNode>();
		s.push(root);
		BTNode prev = null;
		while(!s.isEmpty()) {
			BTNode curr = s.peek();
			if(prev==null || prev.left == curr || prev.right == curr) {
				if(curr.left!=null) {
					s.push(curr.left);
				}
				else if(curr.right!=null) {
					s.push(curr.right);
				}
			}
			else if(curr.left == prev) {
				if(curr.right!=null) {
					s.push(curr.right);
				}
			}
			else {
				res.add(curr.data);
				s.pop();
			}
			prev=curr;
				
		}
		return res;
	}
	
	public void levelorder(BTNode root, ArrayList<ArrayList<Integer>> res) {
		//ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root==null) return;// res;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> curr = new ArrayList<Integer>();
		while(!q.isEmpty()) {
			BTNode temp = q.poll();
			if(temp!=null) {
				curr.add(temp.data);
				if(temp.left!=null) {
					q.offer(temp.left);
				}
				if(temp.right!=null) {
					q.offer(temp.right);
				}
			}
			else {
				ArrayList<Integer> cu_curr = new ArrayList<Integer>(curr);
				res.add(cu_curr);
				curr.clear();
				if(!q.isEmpty()) {
					q.offer(null);
				}
			}
		}
		//return res;
	}

}
