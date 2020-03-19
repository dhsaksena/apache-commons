package com.dhruv.csinsensitivemp;

import java.util.Map;

import org.apache.commons.collections4.map.CaseInsensitiveMap;



public class CaseInsensitiveMapClient 
{

	public static void main(String[] args) 
	{
		Map<String, String> aMap = new CaseInsensitiveMap<String, String>();
		aMap.put("A", "The letter A or a");
		aMap.put("b", "The letter B or b");
		System.out.println("aMap.get(\"a\") = " + aMap.get("a"));
		System.out.println("aMap.get(\"A\") = " + aMap.get("A"));
		System.out.println("aMap.get(\"b\") = " + aMap.get("b"));
		System.out.println("aMap.get(\"B\") = " + aMap.get("B"));
		
		
	}
	
	
}
