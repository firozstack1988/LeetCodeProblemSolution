package dataStructure;

public class StackTest {
	int arr[];
	int size;
	int top;
	StackTest(){
		arr=new int[5];

		top=-1;
	}
	void push(int data) {
		
		if(top==5) {
		System.out.print("Stack Overflow");	
		}
		else {
			arr[++top]=data;
		}
	System.out.print("["+arr[top]+"]");
	}
	
	int  pop(){
		if(top==-1) {
			System.out.print("Empty Stack");
		}
		
		return arr[top--];	
	}
	
public static void main(String[] args) {
	StackTest obj=new StackTest();
	obj.push(10);
	obj.push(11);
	obj.push(12);
	obj.push(13);
	obj.push(14);
	
	System.out.println("After Pop Operation"+obj.pop());	
	
}
}
