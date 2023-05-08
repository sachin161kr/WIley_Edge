package DataStructures;

public class LinkedListClass {
	
static Node head;
	
	static class Node
	{
		int value;		
		Node next;
		
		public Node(int d)
		{
		   value = d;
		   next = null;
		}
	}
	
	public static void deleteAtHead()
	{	
		LinkedListClass.head = LinkedListClass.head.next;
		
	}
	
	public static void deleteAtTail()
	{	
		Node temp = LinkedListClass.head.next;
		
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = null;
		
	}
	
	public static void insertAtHead(int d)
	{
		Node newNode = new Node(d);
		
		newNode.next = LinkedListClass.head;
		
		LinkedListClass.head = newNode;
		
	}
	
	public static void insertAtTail(int d)
	{
		Node newNode = new Node(d);
		
		Node temp = LinkedListClass.head;
		
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		
		temp.next = newNode;
		
	}
	
	public static void insertPos(int d,int pos)
	{
		 Node newNode = new Node(d);
		 
		 Node temp = LinkedListClass.head;
		 
		 while(pos>1)
		 { 
			 temp = temp.next;
			 pos--;
		 }
		 
		 newNode.next = temp.next;
		 
		 temp.next = newNode;
	}
	
	public static void deletePos(int pos)
	{
		 
		 Node temp = LinkedListClass.head;
		 
		 while(pos>1)
		 { 
			 temp = temp.next;
			 pos--;
		 }
		 
		 temp.next = temp.next.next;
		 
	}
	
	public static void printList()
	{
		while(LinkedListClass.head!=null)
		 {
			 System.out.println(LinkedListClass.head.value);
			 LinkedListClass.head = LinkedListClass.head.next;
		 }
	}
	
	public static int search(int d)
	{
		 int pos = 0;
		 
		 boolean found = false;
		 
		 Node temp = LinkedListClass.head;
		 
		 while(temp.next!=null)
		 {   
			 if(temp.value == d)
			 {
				 found = true;
				 break;
			 }
			 temp = temp.next;
			 pos++;
		 }
		 
		 if(!found) return -1;
		 return pos;
	}

	public static void main(String[] args) {		 
		 LinkedListClass.head = new Node(1);
		 
		 Node second = new Node(2);
		 
		 Node third = new Node(3);
		 
		 LinkedListClass.head.next = second;
		 
		 second.next = third;
		 
		 insertAtHead(5);
		 
		 insertAtTail(7);
		 
		 insertAtTail(11);
		 
		 insertPos(0,2);
		 
		 insertPos(-1,3);
		 
		 deleteAtHead();
		 
		 deleteAtHead();
		 
		 deleteAtTail();
		 
		 deletePos(2);
		 
		 //System.out.println(search(-1));
		 
		 printList();
		 

	}

}
