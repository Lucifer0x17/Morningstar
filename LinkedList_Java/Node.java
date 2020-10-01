public class Node<T> 
{
	T data;
	Node<T> ptr;
	
	Node(T data)
	{
		this.data = data;
		ptr = null;
	}
}


