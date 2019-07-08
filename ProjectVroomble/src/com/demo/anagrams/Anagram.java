package com.demo.anagrams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Anagram {

	public static HashSet<HashSet<String>> findAnagram(List<String> arr) {
		HashSet<HashSet<String>> anaList = new HashSet<HashSet<String>>();

		for (int i = 0; i < arr.size(); i++) {
			HashSet<String> set = new HashSet<String>();
			for (int j = 0; j < arr.size(); j++) {
				if (anagram(arr.get(i), arr.get(j))) {
					set.add(arr.get(i));
					set.add(arr.get(j));

				}
			}
			if (!set.isEmpty()) {
				anaList.add(set);

			}

		}

		return anaList;
	}

	private static boolean anagram(String fistString, String secondString) {
		boolean status = false;
		if (fistString.length() != secondString.length()) {
			status = false;
		} else {
			char[] ArrayS1 = fistString.toCharArray();
			char[] ArrayS2 = secondString.toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		return status;

	}
}
