package dataStructure;

public class QueueTest {
	int arr[]=new int[5];
	int front=-1;
	int rear=-1;
	
	void enqueue(int data) {
		if(rear==5) {
			System.out.print("Queue is Full");
		}
		else if(front==-1 && rear==-1) {
			front=rear=0;
			arr[rear]=data;
		}
		else {
			rear++;
			arr[rear]=data;
			
		}
		//System.out.print("["+arr[rear]+"]");
	}
	void dequeue() {
		 
		if(front==-1 && rear==-1) {
			System.out.print("Queue is Empty");
		}
		else if(front==rear){
			front=rear=0;
		}
		else {
			front++;
			
		}
		System.out.print("["+arr[front]+"]");
		 
	}
	
	public static void main(String args[]) {
		QueueTest obj=new QueueTest();
		obj.enqueue(5);
		obj.enqueue(10);
		obj.enqueue(15);
		obj.enqueue(20);
		obj.enqueue(25);
		
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
	}

}
