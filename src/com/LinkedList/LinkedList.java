package com.LinkedList;

public class LinkedList {
	
	Node head = null;

	public void insertAtHead(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addToList(int data) {
		
		Node currentNode = head;
		Node newNode = new Node(data);
		while(currentNode.next != null) {
			
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	public void display() {
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ->");
			currentNode = currentNode.next;
		}
	}
	
	
	
	}

