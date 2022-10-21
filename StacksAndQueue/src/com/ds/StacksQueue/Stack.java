package com.ds.StacksQueue;

public class Stack {
	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addLast(data);

	}

	public void display() {
		list.display();
	}

	public static void main(String[] args) {
		System.out.println("welcome to Stack and Queue Data Structure");
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		
				
	}
 
}
