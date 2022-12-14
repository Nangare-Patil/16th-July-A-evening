package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lhs= new LinkedHashSet<>();
		lhs.add("Pune");
		lhs.add("Pune");
		lhs.add(123);
		lhs.add(null);
		lhs.add(null);
		lhs.add(113.212f);
		lhs.add('A');
		lhs.add(true);
		System.out.println(lhs);
		//for each --> iterator

		for(Object l:lhs)
		{
			System.out.println(l);
		}

		Iterator<Object> l1 = lhs.iterator();
		while (l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
	}

}
