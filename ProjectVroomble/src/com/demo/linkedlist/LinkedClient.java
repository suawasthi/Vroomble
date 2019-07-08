package com.demo.linkedlist;

import java.util.LinkedList;

import com.demo.linkedlist.LinkedList.Node;

public class LinkedClient {

	public static void main(String[] args) {
		
		com.demo.linkedlist.LinkedList linkedList = new com.demo.linkedlist.LinkedList();
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.push(4);
		
		Node currNode = LinkedSearch.search(linkedList, 3);
		
		 while (currNode != null) { 
	            System.out.print(currNode.data + " "); 
	            currNode = currNode.next; 
	        } 
		
		

	}

}
