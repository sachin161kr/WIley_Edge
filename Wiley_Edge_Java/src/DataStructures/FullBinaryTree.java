package DataStructures;



public class FullBinaryTree {
	
	Node root;

	boolean isFullBinaryTree(Node node)
	{
		if(node == null)
		{
			return true;
		}
		
		if(node.left == null && node.right==null)
		{
			return true;
		}
		
		if(node.left != null && node.right!=null)
		{
			boolean left = isFullBinaryTree(node.left);
			boolean right = isFullBinaryTree(node.right);
			
			return (left && right);
		}
		
		return false;

		
	}
	
	public static void main(String[] args) {
		  
       FullBinaryTree tree = new FullBinaryTree();
		
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		
		tree.root.right = new Node(3);
		
		tree.root.left.left = new  Node(4);
		
        tree.root.left.right = new Node(5);
		
		tree.root.left.right.left = new Node(6);
		
		tree.root.left.right.right = new Node(7);
		
		tree.root.left.right.right.left = new Node(7);
		
		if(tree.isFullBinaryTree(tree.root))
		{
			System.out.println("Tree is full binary tree");
		}
		else
		{
			System.out.println("Tree is not full binary tree");
			
		}

	}

}
