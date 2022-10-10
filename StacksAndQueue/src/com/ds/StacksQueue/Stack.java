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
		Stack queue = new Stack();
		queue.push(56);
		queue.push(30);
		queue.push(70);
		queue.display();
		
				
	}

}
