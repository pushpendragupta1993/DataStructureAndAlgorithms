package com.training;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
 
public class GetFirstNonRepeatingCharacterMain {
 public static void main(String[] args) {
	 Character FirstNonRepeatingCharacter = getNonRepeatedCharacter("analogy");
  System.out.println("First non repeated character for String analogy is : " + FirstNonRepeatingCharacter);
 }
 
 public static Character getNonRepeatedCharacter(String str) {
  Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
  for (int i = 0; i < str.length(); i++) {
   Character charvalue = str.charAt(i);
   if (!countCharacters.containsKey(charvalue)) {
    countCharacters.put(charvalue, 1);
   } else {
    countCharacters.put(charvalue, countCharacters.get(charvalue) + 1);
   }
  }
  // As LinkedHashMap maintains insertion order, first character with count 1 should return first non repeated character
  for (Entry<Character, Integer> e : countCharacters.entrySet()) {
   if (e.getValue() == 1)
    return e.getKey();
 
  }
  return null;
 
 }
}
 