package com.LinkedList;

public class LinkedList {
	
	Node head = null;
	Node tail = null;
	
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
	
	public void inBetween(int before, int data) {
		
		Node currentNode = head;
		Node newNode = new Node(data);
		while(currentNode.data == before) {
			
			currentNode = currentNode.next;
		}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
	}
	
	
	public int pop() {
		int deleted = head.data;
		head = head.next;
		return deleted;
	}
	
	public int popLast() {
		Node currentNode = head;
		Node prevNode = head;
		
		while(currentNode.next != null) {
			prevNode = currentNode;
			currentNode = currentNode.next;			
		}
		int deleted = currentNode.data;
		prevNode.next = tail;
		return deleted;
	}
	
	public void searchElement(int value) {
		Node currentNode = head;
		while(currentNode!= null) {
			if (currentNode.data == value) {
				System.out.println(value+" found in linked list");
				break;
			}
			currentNode = currentNode.next;
		}
		//System.out.println(value+" NOT found in linked list");
	}
	
	public void display() {
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ->");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
}

