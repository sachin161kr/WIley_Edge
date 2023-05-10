package DataStructures;

public class BinarySearchTree {
	
	Node root;
	
	static void insert(Node root,int x)
	{ 
		if(root==null) return;
		
		if(root.left==null || root.right==null)
		{
			if(x>root.item)
			{
				root.right = new Node(x);
			}
			else
			{
				root.left = new Node(x);
			}
		}
		
		if(root.item > x)
		{  
			//System.out.println(root.item);
			insert(root.left,x);
		}
		
		//System.out.println(root.item);
		insert(root.right,x);
	}
	
	static boolean search(Node root,int x)
	{
		if(root==null) return false;
		
		if(root.item==x)
		{
			return true;
		}
		
		if(root.item > x)
		{  
			System.out.println(root.item);
			return search(root.left,x);
		}
		
		System.out.println(root.item);
		return search(root.right,x);
	}
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	
	public static void main(String [] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.root  = new Node(8);
		
		bst.root.left = new Node(3);
		
		bst.root.right = new Node(10);
		
		bst.root.right.right = new Node(14);
		
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(6);
		
		bst.root.left.right.left = new Node(4);
		
		bst.root.left.right.right = new Node(7);
		
		//insert(bst.root,12);
		
		insert(bst.root,2);
		
		if(search(bst.root,2)==true)
		{
		    System.out.println("element found");	
		}
		else
		{
			System.out.println("Not found");
		}
	}	
	

}
