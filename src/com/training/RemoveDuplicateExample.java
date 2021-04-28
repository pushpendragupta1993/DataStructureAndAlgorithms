package com.training;

import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class RemoveDuplicateExample
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
       
        System.out.println(Arrays.asList(numbers));
         
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}