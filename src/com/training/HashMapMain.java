package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {
	public static void main(String args[]) {

		HashMap<String, String> countryCapitalMap = new HashMap<String, String>();

		countryCapitalMap.put("Australia", "Canberra");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Russia", "Moscow");
		countryCapitalMap.put("India", "Delhi");

		Set<Entry<String, String>> countryCapitalEntrySet = countryCapitalMap.entrySet();
		List<Entry<String, String>> entryList = new ArrayList<Entry<String, String>>(countryCapitalEntrySet);

		Collections.sort(entryList, new Comparator<Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		// Using LinkedHashMap to keep entries in sorted order
		LinkedHashMap<String, String> sortedHashMap = new LinkedHashMap<String, String>();
		for (Entry<String, String> entry : entryList) {
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}

		for (String countryKey : sortedHashMap.keySet()) {
			System.out.println(countryKey + " -> " + sortedHashMap.get(countryKey));

		}
	}
}