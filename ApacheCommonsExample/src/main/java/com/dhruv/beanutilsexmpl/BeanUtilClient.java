package com.dhruv.beanutilsexmpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilClient 
{
	public static void main(String[] args) 
	{
		Person person = new Person(22, "xyz");
		try {
			Map<String, String> kvMap = BeanUtils.describe(person);
			System.out.println(kvMap);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
