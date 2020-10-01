import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> takeInput()
	{
		
		Node<Integer> head = null;
		Node<Integer> last = null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newNode = new Node<>(data);
			if(head == null)
			{
				head = newNode;
			}
			else
			{
				last.ptr = newNode;
			}
			last = newNode;
			data = sc.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> start ,int data, int pos)
	{
		Node<Integer> temp1 = start;
		Node<Integer> newNode = new Node<>(data);
		
		if(pos == 1)
		{
			newNode.ptr = start;
			start = newNode;
		}
		else
		{
			for(int i = 0; i< pos - 2 && temp1.ptr != null; i++)
			{
				temp1 = temp1.ptr;
			}
			
			newNode.ptr = temp1.ptr;
			temp1.ptr = newNode;
		}
		
		return start;
		
	}
	
	public static Node<Integer> insertRecursive(Node<Integer> start,int pos, int data)
	{
		if(start == null)
		{
			return start;
		}
		if(pos == 0)
		{
			Node<Integer> newNode = new Node<>(data);
			newNode.ptr = start;
			start = newNode;
			return start;
		}
		
		start.ptr = insertRecursive(start.ptr, pos - 1, data);
	
		return start;

	}
	
public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		
        if(head == null || head.ptr == null)
        {
            return head;
        }
        
    	Node<Integer> prevHead = evenAfterOdd(head.ptr);
    	head.ptr = prevHead;
		
    	print(head);
    	System.out.println();
    	
    	Node<Integer> temp1 = head;
    	Node<Integer> temp2 = prevHead;
    	
    	while(temp2.ptr != null)
    	{
    		if(temp1.data % 2 == 0 && temp2.data % 2 != 0)
            {
            	Node<Integer> temp = temp1;
                head = temp.ptr;
                temp.ptr = prevHead.ptr;
                prevHead.ptr = temp;
            }
    		
    		temp1 = temp1.ptr;
            temp2 = temp2.ptr;
            
    	}
//        print(head);
//        System.out.println();
        return head;
    }
	
	public static Node<Integer> delete(Node<Integer> start , int pos)
	{
		int flag = 0;
		Node<Integer> temp = start;
		
		if(pos == 1)
		{
			start = temp.ptr;
		}
		else
		{
			Node<Integer> temp1 = null;
			for(int i = 1; i< pos; i++)
            {
                temp1 = temp;
                temp = temp.ptr;
                if(temp == null)
                {
                    flag = 1;
                    break;   
                }
            }
            if(flag != 1)
            {
                temp1.ptr = temp.ptr; 
            }
            else
            {
                System.out.println("Error");
            }
		}
		
		return start;
	}
	
	public static int[] middleElement(Node<Integer> start)
	{
		Node<Integer> temp = start;
		int length = 0;
		
		while(temp != null)
		{
			length++;
			temp = temp.ptr;
		}
		
		temp = start;
		if(length % 2 !=0)
		{
			int arr[] = new int[1];
			for(int i = 1; i <= length/2; i++)
			{
				temp = temp.ptr;
			}
			arr[0] = temp.data;
			return arr;
		}
		else
		{
			int arr[] = new int[2];
			for(int i = 1; i < length / 2; i++)
			{
				temp = temp.ptr;
			}
			
			arr[0] = temp.data;
			arr[1] = temp.ptr.data;
			return arr;
		}
		
		
	}
	
	public static Node<Integer> reverseRecursive(Node<Integer> head)
	{
		if(head == null || head.ptr == null)
		{
			return head;
		}
		
		Node<Integer> newHead = reverseRecursive(head.ptr);
		Node<Integer> temp = newHead;
		
		while(temp.ptr != null)
		{
			temp = temp.ptr;
		}
		
		temp.ptr = head;
		head.ptr = null;
		
		return newHead;
	}
	
	public static DoubleNode reverseRecursiveBetter(Node<Integer> head)
	{
		if(head == null || head.ptr == null)
		{
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			
			return ans;
		}
		
		DoubleNode ans = reverseRecursiveBetter(head.ptr);
	
		ans.tail.ptr = head;
		ans.tail = head;
		ans.tail.ptr = null;
		
		return ans;
	}
	
	public static Node<Integer> merge(Node<Integer> head, Node<Integer> head1)
	{
		Node<Integer> temp = head;
		Node<Integer> temp1 = head1;
		Node<Integer> newHead = null;
		Node<Integer> last = null;
		
		while(temp != null && temp1 != null)
		{
			if(temp.data <= temp1.data)
			{
				Node<Integer> newNode = new Node<>(temp.data);
				if(newHead == null)
				{
					newHead = newNode;
				}
				else
				{
					last.ptr = newNode;
				}
				last = newNode;
				temp = temp.ptr;
			}
			
			else
			{
				Node<Integer> newNode = new Node<>(temp1.data);
				if(newHead == null)
				{
					newHead = newNode;
				}
				else
				{
					last.ptr = newNode;
				}
				last = newNode;
				temp1 = temp1.ptr;
			}
		}
		
		while(temp != null)
		{
			Node<Integer> newNode = new Node<>(temp.data);
			if(newHead == null)
			{
				newHead = newNode;
			}
			else
			{
				last.ptr = newNode;
			}
			last = newNode;
			temp = temp.ptr;
		}
		
		while(temp1 !=null)
		{
			Node<Integer> newNode = new Node<>(temp1.data);
			if(newHead == null)
			{
				newHead = newNode;
			}
			else
			{
				last.ptr = newNode;
			}
			last = newNode;
			temp1 = temp1.ptr;
		}
		
		return newHead;
	}
	

	public static Node<Integer> bubbleSort(Node<Integer> head) {         
		
        Node<Integer> temp = head;
        
        int count  = 0;
        
        while(temp != null)
        {
            count++;
            temp = temp.ptr;
        }
        
        if(count == 0 || count == 1)
        {
            return head;
        }
        
        Node<Integer> temp1 = head;
        
        for(int i = count; i> 0; --i)
        {
            temp = head;
            temp1 = head;
            
            System.out.println();
            print(head);
            																	
            for(int j = 0; j < i && temp.ptr != null ; j++)
            {
            
                if(temp.data > temp.ptr.data)
                {
                	Node<Integer> temp2 = temp.ptr;
                    temp.ptr = temp2.ptr;
                    temp2.ptr = temp;
                    
                    
                    if(temp == head)
                    {
                        head = temp.ptr;
                        temp1 = temp1.ptr;
                    }
                    
                    else
                    {
						temp1.ptr = temp2;
                        temp1 = temp2;
                    }
                }
                else
                	temp1 = temp;
                    temp = temp.ptr;         
            }
        }
        
        return head;
	}

	
	public static void print(Node<Integer> temp) 
	{
		Node<Integer> head= temp;
		do
		{
			System.out.print(head.data + " ");
			head = head.ptr;
		}while(head != null);
	}

	public static void main(String[] args) {
		
//		Node<Integer> n1 = new Node<>(10); 
//		Node<Integer> n2 = new Node<>(20);
//		
//		n1.ptr = n2;
//		System.out.println(n1.data + " " + n1.ptr);
//		System.out.println(n2.data + " " + n2.ptr);
//		
//		Node<Integer> head = n1;
//		print(head);
		
		Node<Integer> head = takeInput();
		print(head);
//		Node<Integer> head1 = takeInput();
//		print(head1);
//		
//		head = insert(head,5,1);
//		insert(head,25,3);
//		
//		System.out.println();
//		print(head);
//		
//		head = delete(head,1);
//		head = delete(head, 3);
//		
//		System.out.println();
//		print(head);
//		
//		System.out.println();
//		int arr[] = middleElement(head);
//		
//		System.out.println();
//		for(int i = 0; i< arr.length; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println();
//		
//		Node<Integer> newHead = merge(head,head1); // merging two sorted linked lists
//		print(newHead);
//		
//		System.out.println();
//		
//		Node<Integer> newHead1 = reverseRecursive(head);// Reversing LL using single Node
//		print(newHead1);
//		
//		System.out.println();
//		
//		DoubleNode ans = reverseRecursiveBetter(head1);// reversing LL using Double Node
//		print(ans.head);
		System.out.println();
//		head = insertRecursive(head, 7, 15);
//		print(head);
		
//		head = evenAfterOdd(head);
//		print(head);
		
		head = bubbleSort(head);
		print(head);
	}
}
