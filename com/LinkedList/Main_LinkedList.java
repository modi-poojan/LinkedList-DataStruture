package com.LinkedList;

public class Main_LinkedList {

	public static void main(String[] args) {
		System.out.println("\n\nLinked List Program\n\n");
		LinkedList call = new LinkedList();
		call.insertAtHead(56);
		call.addToList(30);
		call.addToList(70);
		call.display();
		
		int deleted= call.popLast();
		System.out.println("\n\n"+deleted+" Element at last deleted");
		System.out.println("\nLinked List after pop operation is\n ");
		call.display();
	}
}
