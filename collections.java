package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class collections {
	public static void main(String args[]) {
		System.out.println("Arraylist");
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("Vyshna Ankireddy");
		s1.add("RKSR");
		Iterator it=s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		System.out.println("linked list");
		LinkedList<String> l=new LinkedList<String>();
		l.add("hello this is : Vyshna Ankireddy");
		l.add("hello this is my Friend :RKSR");
		Iterator itr=l. iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(100);
		h.add(200);
		h.add(7000);
		h.add(750000);
		System.out.println(h);
		
		
	}

}
