package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy 
{

	public static void main(String[] args) 
	{
		LinkedList<Object>ll= new LinkedList<>();
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(true);
		ll.add('M');
		ll.add(123.3435f);
		System.out.println(ll);
		ll.add(2, "Katraj");
		System.out.println(ll);
		ll.addFirst("Velocity");
		System.out.println(ll);
		ll.addLast("MH");
		System.out.println(ll);
		ll.offer("AP");
		System.out.println(ll);
		ll.offerFirst("IND");
		ll.offerLast("Test");
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		ll.push("Mum");
		System.out.println(ll);
		System.out.println(ll.size());
		//for loop, for each, iterator, listIterator 
		//for loop
		//listIterator 
		System.out.println("==========for each============");
		for(Object l:ll)
		{
		System.out.println(l);
		}
		System.out.println("==========iterator============");
		Iterator<Object> it = ll.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

	}

}
