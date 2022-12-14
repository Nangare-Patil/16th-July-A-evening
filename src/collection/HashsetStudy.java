package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy

{

	public static void main(String[] args) 
	{
		HashSet<Object> hs= new HashSet<>();
		hs.add("one");
		System.out.println(hs.add(999));
		hs.add(null);
		hs.add(null);
		System.out.println(hs.add(999));
		hs.add('A');
		hs.add(true);
		System.out.println(hs);
		//set doesnot supports travsering using for loop
		//for each, iterator
		for(Object h:hs) 
		{
		System.out.println(h);
		}
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

	}

}
