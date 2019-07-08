package com.demo.rangesearch;

import java.util.Scanner;

public class RangeSearch {

	public static int[] findRange(int args[]) {
		System.out.println("Please enter element to search....");
		int[] result = new int[2];
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		int last = args.length;
		int first = firstOccurrence(args, 0, last, key);
		int lastO = -1;
		if (first != -1) {
			result[0] = first;
			lastO = lastOccurrence(args, 0, last, key);
			result[1] = last != -1 ? lastO : first;
		} else {
			result[0] = first;
			result[1] = lastO;
		}
		scan.close();
		return result;

	}

	private static int firstOccurrence(int[] a, int start, int last, int key) {
		int mid = (start + last) / 2;
		while (start <= last) {
			if (a[mid] == key) {
				return mid;
			}
			if (a[mid] < key) {
				start = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (start + last) / 2;
		}
		if (start > last) {
			return -1;
		}

		return -1;
	}

	private static int lastOccurrence(int[] a, int start, int last, int key) {

		while (start < last) {
			int mid = start + ((last - start) + 1) / 2;

			if (isLessThanEqualTo(a, mid, key)) {
				start = mid;
			} else {
				last = mid - 1;
			}
		}
		return (a[start] == key) ? start : -1;
	}

	private static boolean isLessThanEqualTo(int[] a, int index, int key) {
		if (a[index] <= key)
			return true;

		return false;
	}

}
