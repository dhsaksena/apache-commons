package com.dhruv.transformer;



import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.TransformerUtils;

import com.dhruv.closure.PrintIt;
public class ChainedTransformer
{
	public static void main(String[] args)
	{
		List<OldBill> aList = Arrays.asList(new OldBill("A1"), new OldBill("A2"),
				new OldBill("A3"), new OldBill("A4"));
		Transformer[] chainedTransformer = new Transformer[]{
				new Transformer() {
					public Object transform(Object o) {
						return ((OldBill )o).getId().replace('A', 'Z');
					}
				},
				new Transformer() {
					public Object transform(Object o) {
						char[] c = ((String) o).toCharArray();
						int x = Integer.parseInt(String.valueOf(c[1])) + 500;
						return new NewBill( String.valueOf(c[0]) + x );
					}
				}
		};
		System.out.println("The aList");
		IterableUtils.forEach(aList, PrintIt.getInstance());
		List<NewBill> bList = (List<NewBill>) CollectionUtils.collect(aList, TransformerUtils.chainedTransformer(chainedTransformer));
		System.out.println("\nThe bList");
		IterableUtils.forEach(bList, PrintIt.getInstance());
	}
}

 class OldBill
{
	private String id;
	public OldBill(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	@Override public String toString()
	{
		return "OldBill{id='" + id + "\'}";
	}
}
class NewBill
{
	private String id;
	public NewBill(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	@Override public String toString()
	{
		return "NewBill{id='" + id + "\'}";
	}
}