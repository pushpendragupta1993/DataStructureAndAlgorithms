package com.training;

public class StringReverseRecursive {

	 /* Function to print reverse of the passed string */
   public static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            String subString = str.substring(0,str.length()-1);
            reverse(subString);
        }
    } 	
    public static void main(String[] args) 
    {
        String str = "lovecoding";
        StringReverseRecursive.reverse(str);
    }    
}

