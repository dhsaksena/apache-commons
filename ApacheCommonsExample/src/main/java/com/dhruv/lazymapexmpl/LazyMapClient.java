package com.dhruv.lazymapexmpl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.map.LazyMap;
import org.apache.commons.lang3.StringUtils;

public class LazyMapClient 
{
	
	public static void main(String[] args) {
		Map<String, String> existingMap = new HashMap<String, String>();
		existingMap = LazyMap.lazyMap(existingMap, new Transformer<String, String>()
		{
			public String transform(String input) 
			{
				return StringUtils.upperCase(input);
			}
		});
		
		System.out.println(existingMap.get("Hello"));
		
		
		
		
		
	}

}
