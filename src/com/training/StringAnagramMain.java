package com.training;

public class StringAnagramMain {
	 
    public static void main(String[] args) {
 
        String word1 = "java2blog";
        String word2 = "aj2vabgol";
        boolean isAnagram  = isAnagramUsingStringMethods(word1, word2);
        System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagram);
 
    }
 
    public static boolean isAnagramUsingStringMethods(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
 
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            int index = word2.indexOf(c);
            if (index != -1) {
                word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
            } else
                return false;
        }
        return word2.isEmpty();
    }
 
}