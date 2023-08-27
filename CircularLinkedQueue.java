import java.util.NoSuchElementException;
public class CircularLinkedQueue<T> implements QueueInterface<T>
{
	private Node head;
	private Node tail;

	public CircularLinkedQueue()
	{
		head=null;
	  	tail=null;
	}

	public void enqueue(T entry)
	{
		Node data = new Node(entry);
		data.setNextNode(null);
		if(isEmpty())
		{
			head=data;
			tail=data;
			tail.setNextNode(head);
		}
		else
		{
			tail.setNextNode(data);
			tail=data;
			tail.setNextNode(head);
			
		}

	}

	public T dequeue()
	{
		T toreturn = getFront();
		if(head!=null)
		{
			head.setData(null);
			head=head.getNextNode();
			tail.setNextNode(head);
			if (head==null) {
				tail=null; 
			}
		}
		return toreturn;

	}

	public T getFront()
	{
		
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue is Empty");
		}
		else
			return head.getData();
		
	}

	public boolean isEmpty()
	{
		if(head==null&&tail==null)
		{
			return true;
		}
		else
			return false;

	}

	public void clear()
	{
		head=null;
		tail=null;
	}


	public void print() 
	{  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
        }  
        else 
        {  
            System.out.println("Nodes of the circular linked list: ");  
            do
            {  
                System.out.print(" "+ current.data);  
                current = current.getNextNode();  
            }
            while(current != head);  
            	System.out.println();  
        }  
    }  



	


	private class Node
	{
		private T data;
		private Node next;


		private Node()
		{
			data=null;
			next=null;
		}

		private Node(T dataPortion)
		{
			data = dataPortion;
			next = null;
		} 
		
		private Node(T dataPortion, Node linkPortion)
		{
			data = dataPortion;
			next = linkPortion;
		} 
      
		private T getData()
		{
			return data;
		} 
      
		private void setData(T newData)
		{
			data = newData;
		} 
      
		private Node getNextNode()
		{
			return next;
		} 
		
		private void setNextNode(Node nextNode)
		{
			next = nextNode;
		} 
	}

} 
