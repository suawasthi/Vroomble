package com.demo.linkedlist;

import com.demo.linkedlist.LinkedList.Node;

public class LinkedSearch {

	public static Node search(LinkedList node , int key) {
		
		if(node == null) {
			return null;
		}
			Node p = node.head ;
			Node head= node.head;
		
		    int len = 0;
		    while(p != null){
		        len++;
		        p = p.next;
		    }
		    int fromStart = len-key+1;
		    if(fromStart==1)
		        return head.next;

		    p = head;
		    int i=0;
		    while(p!=null){
		        i++;
		        if(i==fromStart-1){
		            p.next = p.next.next;
		        }
		        p=p.next;
		    }
		 
		    return head;
		
	}
}
