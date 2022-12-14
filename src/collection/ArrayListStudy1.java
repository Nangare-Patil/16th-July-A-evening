package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy1 

{

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		al.add("Pune");
		al.add(123);
		al.add("Pune");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(12.123f);
		al.add('A');
		al.add(true);
		System.out.println(al);
		
		al.add(1, "Katraj");
		System.out.println(al);
		// al.clear();
		// System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(1234));
		
		Object al1 = al.clone();
		System.out.println(al1);
		System.out.println(al.equals(al1));
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		System.out.println(al.indexOf('A'));
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.remove(true));
		System.out.println(al);
		System.out.println(al.set(5, "Hi"));
		System.out.println(al);
		System.out.println(al.size());
		
		
		ArrayList<Integer>al2= new ArrayList<>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		System.out.println(al2);


		System.out.println("===========for loop=================");
		for(int i=0;i<=al.size()-1;i++)
		{
		System.out.println(al.get(i));//0 1 2 3 4 5 
		}
		System.out.println("===========for each loop=================");
		for(Object a:al)
		{
		System.out.println(a);
		}
		System.out.println("===========iterator=================");
		Iterator<Object> it = al.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("===========List-iterator=================");
		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())
		{
		System.out.println(li.next());
		}

	}

}
