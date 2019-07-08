package com.demo.rangesearch;

import java.util.Arrays;

public class SearchClient {

	public static void main(String[] args) {
		int[] postive = {5,7,7,8,8,10};
		int[] negative ={5,7,7,8,8,10};
		System.out.println(Arrays.toString(RangeSearch.findRange(negative)));
	}
}
