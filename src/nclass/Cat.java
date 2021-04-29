package nclass;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Cat 
{
	public static void main(String[] args)
	{	
		//Collection<Integer> c = new LinkedList<>();
		LinkedList<Integer> c = new LinkedList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		
		System.out.println(c.get(1));
		
		Iterator<Integer> iter = c.iterator();
		//while(iter.hasNext())
		//{
			//System.out.println(iter.next());
		//}
		c.forEach(p -> System.out.println(p));
		//c.removeIf(p -> p.equals(1));
		System.out.println();
		c.forEach(p -> System.out.println(p));
		
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(c);
		s.add(1);
		s.add(1);
		s.add(0);
		
		TreeSet<Integer> t = new TreeSet<Integer>(s);
		t.addAll(s);
		t.add(10);
		t.add(11);
		t.add(28);
		t.forEach(p -> System.out.println(p));
		//LinkedHashSet<Integer> hls = new LinkedHashSet<>();
		HashSet<Integer> hls = new HashSet<>();
		for(Integer index = 0 ; index < 10; ++index)
		{
			hls.add(index);
		}
		hls.forEach(p -> System.out.println(p));
		System.out.println();
		
		
		hls.clear();
		for(Integer index = 9 ; index >= 0; --index)
		{
			hls.add(index);
		}
		hls.forEach(p -> System.out.println(p));
		System.out.println();
	}
}
