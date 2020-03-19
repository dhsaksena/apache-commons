package com.dhruv.transformer;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Transformer;

import com.dhruv.closure.PrintIt;

public class SimpleTransformer
{
public static void main(String[] args)
{
  Collection<String> stringOfNumbers = Arrays.asList("1", "2", "3", "4");
  Collection<Integer> intNums = CollectionUtils.collect(stringOfNumbers, new Transformer<String , Integer>() {
      public Integer transform(String o) {
          return Integer.valueOf( o);
      }
  });
  
  IterableUtils.forEach(intNums, PrintIt.getInstance() );
}
}