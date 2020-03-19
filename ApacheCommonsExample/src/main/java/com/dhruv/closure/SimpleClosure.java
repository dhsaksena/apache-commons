package com.dhruv.closure;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.StringUtils;
public class SimpleClosure
{
	public static void main(String[] args)
	{
		System.out.println("\nTest Number One Results :");
		List<String> collectionOfWords = Arrays.asList("Java", "Example",
				"Help", "Tips", "And",
				"Tricks", "Apache",
				"Commons", "Collections");
		// Lets call toString on every object and print it out.
		IterableUtils.forEach(collectionOfWords, new Closure<String>()
		{
			public void execute(String o)
			{
				assert o != null;
				System.out.print(o.toString() + " ");
			}
		});
		System.out.println("\n\nTest Number Two Results :");
		int i = 1;
		List<DTO> collectionOfDTOs = Arrays.asList(new DTO(i++, "Java Tips and Tricks"),
				new DTO(i++, "Apache Commons"      ),
				new DTO(i++, "Jakarta Commons"     ),
				new DTO(i++, "Collections"         ),
				new DTO(i++, "Closures"            ));
		IterableUtils.forEach(collectionOfDTOs, new Closure()
		{
			public void execute(Object o)
			{
				DTO dto = (DTO) o;
				assert dto != null;
				String s = StringUtils.defaultIfEmpty(dto.getName(), "null");
				dto.setName("Yoda says, " + s + " Rocks!");
			}
		});
		IterableUtils.forEach(collectionOfDTOs,PrintIt.getInstance());
	}
}










