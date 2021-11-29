package com.LinkedList;

public class Main_LinkedList {

	public static void main(String[] args) {
		System.out.println("\n\nLinked List Program\n\n");
		LinkedList call = new LinkedList();
		call.insertAtHead(56);
		call.addToList(30);
		call.addToList(70);
		call.display();
		call.size();
		call.inBetween(30, 40);
		call.size();
		call.display();
		call.searchDelete(40);
		call.display();
		call.size();

	}
}
