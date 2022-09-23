package week3.day2.assignment;

import java.util.Map;
import org.apache.commons.collections4.map.HashedMap;

public class FirstMostDuplicate {

	public static void main(String[] args) {

		String input = "abbaba";
		char[] charArray = input.toCharArray();
		Map<Character, Integer> map = new HashedMap<Character, Integer>();

		int maxOccurence = 0;
		char maxKey = 0;
		for (int i = 0; i < charArray.length; i++) {
			
			map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
			if (map.get(charArray[i]) > maxOccurence) {
				maxOccurence = map.get(charArray[i]);
				maxKey = charArray[i];
			}

		}

		System.out.println(maxKey);
		
		
		/* To get the maximum occurance
		 * for (char ch : charArray) { map.put(ch, map.getOrDefault(ch, 0) + 1); }
		 */
		
//		int maxOccurence=0;
//		char maxKey=0;
//		Set<Entry<Character, Integer>> entryS = map.entrySet();
//		
//		for (Entry<Character, Integer> eachEntry : entryS) {
//			if(eachEntry.getValue()>maxOccurence) {
//			maxKey= eachEntry.getKey();
//			maxOccurence= eachEntry.getValue();
//		}
//	}
//		System.out.println(maxKey);
	}
}