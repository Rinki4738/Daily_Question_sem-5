package first;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import first.treee.Node;

public class tree_question {

	class Node{
		int val;
		Node left;
		Node right;
		
		
	}
	private Node root;
	Scanner sc=new Scanner(System.in);
	public tree_question() {
		root=CreateTree();
	}
	private Node CreateTree() {
		int item=sc.nextInt();
		Node nn=new Node();
		nn.val=item;
		boolean hlc=sc.nextBoolean();//has left child
		if(hlc) {
			nn.left= CreateTree();
		}
		boolean hrc=sc.nextBoolean();//has right child
		if(hrc) {
			nn.left= CreateTree();
		}
		return nn;
	}
	public boolean find(int item) {
		return find(root,item);
	}
	private boolean find(Node nn,int item) {
		if(nn==null) {
			return false;
		}
		if(nn.val==item) {
			return true;
		}
		boolean left=find(nn.left,item);
		boolean right=find(nn.right,item);
		return left||right;
	}
	public int max() {
		return max(root);
	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int lmax=max(nn.left);
		int rmax=max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));
	}
	// max distance b/w rrot node and leaf node-- height of tree
	public int ht() {
		return ht(root);
	}
	private int ht(Node nn) {
		if(nn==null) {
			return -1;
		}
		int lh=ht(nn.left);
		int rh=ht(nn.right);
		return Math.max(lh, rh)+1;
	}
	public void perorder() {
		perorder(root);
	}
	private void perorder(Node nn) {
		if(nn==null) {
			return;
		}
		System.out.println(nn.val+"");
		perorder(nn.left);
		perorder(nn.right);
	}
	public void inorder() {
		inorder(root);
	}
	private void inorder(Node nn) {
		if(nn==null) {
			return;
		}
		inorder(nn.left);
		System.out.println(nn.val+"");
		inorder(nn.right);
	}
	public void postorder() {
		postorder(root);
	}
	private void postorder(Node nn) {
		if(nn==null) {
			return;
		}
		postorder(nn.left);
		postorder(nn.right);
		System.out.println(nn.val+"");
	}
	public void levelorder() {
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);//addlast
		while(!queue.isEmpty()) {
			Node n=queue.poll();//remove first
			System.out.println(n.val+" ");
			if(n.left!=null) {
				queue.add(n.left);
			}
			if(n.right!=null) {
				queue.add(n.right);
			}
			
		}
		System.out.println();
		
		
	}
	
	
	

}
