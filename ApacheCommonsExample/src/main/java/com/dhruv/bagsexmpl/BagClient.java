package com.dhruv.bagsexmpl;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public class BagClient 
{
	
	public static void main(String[] args) 
	{
		
		Bag<String> bag = new HashBag<String>();
		bag.add("Test");
		
		
		System.out.println(bag.getCount("Test"));
		
		bag.add("Test", 4);
		
		System.out.println(bag.getCount("Test"));
		
		bag.remove("Test" , 1);
		
		System.out.println(bag.getCount("Test"));
		
		
		for(String value : bag)
		{
			System.out.println(value);
		}
		
	}

}
