package Besics;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<11;i++)
		{
			al.add(i);
		}
		System.out.println("initially : "+al);
		
		al.set(9, 11);
		System.out.println("after set : "+al);
		
		al.remove(9);
		System.out.println("after removal : "+al);
		
		System.out.print("iteration using iterator : ");
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
	}

}
