package com.dhruv.comparetobuilder;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

class BuilderBean implements Comparable {

  private String prop1;

  private String prop2;

  public String getProp1() {
    return prop1;
  }

  public void setProp1(String pProp1) {
    prop1 = pProp1;
  }

  public String getProp2() {
    return prop2;
  }

  public void setProp2(String pProp2) {
    prop2 = pProp2;
  }

  public String toString() {
	  
    return ReflectionToStringBuilder.toString(this);
  }

  public boolean equals(Object pObject) {
    return EqualsBuilder.reflectionEquals(this, pObject);
  }

  public int compareTo(Object pObject) {
	 
    return CompareToBuilder.reflectionCompare(this, pObject);
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
}

public class MainClass {
  public static void main(String[] pArgs) throws Exception {
    // Builder and Builder2 contain the same content
    BuilderBean builder = new BuilderBean();
    builder.setProp1("One");
    builder.setProp2("Two");

    BuilderBean builder2 = new BuilderBean();
    builder2.setProp1("One");
    builder2.setProp2("Two");

    BuilderBean builder3 = new BuilderBean();
    builder3.setProp1("Uno");
    builder3.setProp2("Dos");

    System.out.println("builder compareTo builder2: " + builder.compareTo(builder2));
    System.out.println("builder compareTo builder3: " + builder.compareTo(builder3));

  }

}