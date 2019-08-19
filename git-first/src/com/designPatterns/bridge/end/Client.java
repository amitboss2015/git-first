package com.designPatterns.bridge.end;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Object> collection = new Queue<Object>(new SinglyLinkedList<Object>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);
		
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		//
		System.out.println(collection.poll());
	}

}
