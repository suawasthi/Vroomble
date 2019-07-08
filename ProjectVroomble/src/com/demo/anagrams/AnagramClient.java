package com.demo.anagrams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AnagramClient {

	public static void main(String[] args) {
	
		List<String> lst = new ArrayList<String>();
		String[] s= {"eat", "tea", "tan", "ate", "nat", "bat"};
		lst= Arrays.asList(s);
		System.out.println(Anagram.findAnagram(lst));

	}

}
