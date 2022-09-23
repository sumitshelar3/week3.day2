package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		int[] numArray1 = { 3, 2, 11, 4, 6, 7 };
		int[] numArray2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> set1 = new ArrayList<Integer>();
		List<Integer> set2 = new ArrayList<Integer>();

		// Add array values into List
		for (Integer result1 : numArray1) {
			set1.add(result1);
		}
		for (Integer result2 : numArray2) {
			set2.add(result2);
		}

		for (int i = 0; i < set1.size(); i++) {
			for (int j = 0; j < set2.size(); j++) {
				if (set1.get(i) == set2.get(j)) {
					System.out.println(set1.get(i));
				}
			}

		}

	}
}
