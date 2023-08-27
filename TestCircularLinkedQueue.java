public class TestCircularLinkedQueue
{


	public static void main(String[] args) {
		
		QueueInterface<String> check0 = new CircularLinkedQueue<String>();
		
		check0.enqueue("191370041");
		check0.enqueue("Muhammad");
		check0.enqueue("Abbas");
		check0.enqueue("Nawaz");
		check0.print();

		check0.dequeue();
		check0.dequeue();
		check0.print();
		check0.dequeue();
		check0.print();
		System.out.println(check0.getFront());
		System.out.println(check0.isEmpty());
		
		System.out.println();
		System.out.println();

		QueueInterface<Integer> check1 = new CircularLinkedQueue<Integer>();
		
		check1.enqueue(191370041);
		check1.enqueue(005);
		check1.enqueue(-598);
		check1.enqueue(191370041);
		check1.print();

		check1.dequeue();
		check1.dequeue();
		check1.print();
		check1.dequeue();
		check1.print();
		System.out.println(check1.getFront());
		System.out.println(check1.isEmpty());		
		check1.clear();
		check1.print();
	}

	

}