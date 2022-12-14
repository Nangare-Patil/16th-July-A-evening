package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy 

{

	public static void main(String[] args) 
	
	{
		Vector<Integer> v=new Vector<>();
		v.add(12);
		v.add(12);
		v.add(null);
		v.add(null);
		v.add(1);
		v.add(212);
		System.out.println(v);
		v.add(1, 999);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(212);
		v.add(213);
		v.add(214);
		v.add(215);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.elementAt(0));
		//for loop, for each, iterator, listIterator, enumeration
		System.out.println("===========for loop=================");
		for(int i=0;i<=v.size()-1;i++ )
		{
		System.out.println(v.get(i));
		}
		System.out.println("===========for each loop=================");
		for(Integer ve:v)
		{
		System.out.println(ve);
		}
		System.out.println("===========iterator=================");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("===========List-iterator=================");
		ListIterator<Integer> li = v.listIterator();
		while(li.hasNext())
		{
		System.out.println(li.next());
		}


	}

}
