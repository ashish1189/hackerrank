package strings;

import java.util.Scanner;

public class LexicographicalOrder {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		java.util.List<String> list = new java.util.ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			if ((i + k) < (s.length() + 1)) {
				list.add(s.substring(i, i + k));
			}
		}

		Object[] sorted = list.toArray();
		java.util.Arrays.sort(sorted);

		smallest = sorted[0].toString();
		largest = sorted[list.size() - 1].toString();

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}