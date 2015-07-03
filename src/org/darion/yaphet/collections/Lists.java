package org.darion.yaphet.collections;

import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		for (int index = 0; index < 10; index++) {
			list.add(index, index);
		}
		System.out.println("Linked List : " + list);

	}
}
