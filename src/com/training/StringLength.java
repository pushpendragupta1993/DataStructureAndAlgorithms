package com.training;

public class StringLength {
	   public static void main(String args[]) throws Exception {
	      String str = "sample";
	      int i = 0;
	      char arrayOfCharacters[] = str.toCharArray();
	      for(char c: arrayOfCharacters) {
	         i++;
	      }
	      System.out.println("Length of the given string : "+i);
	   }
	}
