package week3.day2.assignment;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {

		int input[] = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		// output: 2 -> 3 , 3 -> 2, 4 -> 1

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int output : input) {

			// map.put(output, (map.getOrDefault(map.get(output), 0) + 1));
			if (map.containsKey(output)) {

				map.put(output, map.get(output) + 1);

			} else {
				map.put(output, 1);
			}
		}
		System.out.println(map);
	}
}