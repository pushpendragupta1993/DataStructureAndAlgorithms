package com.training;

public class CountWordsInSentence {
	
	public static void main(String[] args) {
		String paragraph = "if you like this video please subscribe to be updated with the latest videos";
		String words[] = paragraph.split(" ");
		int countOfWords = words.length;
		System.out.println(countOfWords);
	}

}
