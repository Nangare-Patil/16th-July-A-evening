package collection;

import java.util.TreeSet;

public class TreeSetStudy
{

	public static void main(String[] args) 
	{
		TreeSet<Object> ts= new TreeSet<>();
		ts.add(12);
		//ts.add("hi"); -->ClassCastException:
		//ts.add(null);-->null values are not allowed-->NullPointerException
		ts.add(12);
		ts.add(11);
		ts.add(14);
		ts.add(13);
		ts.add(10);
		ts.add(18);
		System.out.println(ts);


	}

}
