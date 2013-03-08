package org.pro.lang;

import java.util.Collections;
import java.util.List;

public class Pro {
  static public void main(String[] args) {
    // TODO something
    int[] a1 = new int[10];
    int[] a2 = new int[20];
    int sum1 = 0;
    int sum2 = 0;
    int avg1, avg2;
    
    for (int i = 0; i < a1.length; i++)
      sum1 += a1[i];
    avg1 = sum1/a1.length;
    System.out.println(avg1);
    
    for (int i = 0; i < a2.length; i++)
      sum1 += a2[i];
    avg2 = sum1/a2.length;
    System.out.println(avg1);
  }
  
  private void foo() {
    // FIXME
  }
  
  List<String> foo = Collections.EMPTY_LIST;
  
  private void bar() {
    // TODO whatever
    Integer x = null;
    int i = x + 1;
  }
  
  private int fact(int n) {
    if (n < 2) return 1;
    return n*fact(n-1);
  }
  
  private int dup(int n) {
    if (n < 2) return 1;
    return n*fact(n-1);
  }
}