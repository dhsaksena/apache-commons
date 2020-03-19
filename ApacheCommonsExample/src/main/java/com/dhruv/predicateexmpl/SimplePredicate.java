package com.dhruv.predicateexmpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;

import com.dhruv.closure.PrintIt;
public class SimplePredicate
{
public static void main(String[] args)
{
  List<String> mixedup = Arrays.asList("A", "0", "B", "C", "1", "D", "F", "3");
  
  
  
  Collection<String> numbersOnlyList = CollectionUtils.predicatedCollection(new ArrayList<String>(),
      new Predicate<String>() {
          public boolean evaluate(String o) {
              try {
                  Integer.valueOf((String) o);
                  return true;
              } catch (NumberFormatException e) {
                return false;
              }
          }
      });
  for (String s : mixedup) {
      try {
          numbersOnlyList.add(s);
      } catch (IllegalArgumentException e) {
          System.out.println("Not a number");
      }
  }
  System.out.println("\nResults of the predicatedCollection List:");
  IterableUtils.forEach(numbersOnlyList, PrintIt.getInstance() );
}
}