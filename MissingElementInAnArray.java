package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8, 10, 13 };
		List<Integer> result = new ArrayList<Integer>();
		for (Integer output : arr) {
			result.add(output);
		}
		Collections.sort(result);   // Sorting the List values
		System.out.println(result); // To print sorted list
		int size = result.size();
		int count = 1;
		for (int i = 0; i < size; i++) {
			if ((i + count) != result.get(i)) {
				System.out.println(i + count);
				count++;
			}
		}

	}
}