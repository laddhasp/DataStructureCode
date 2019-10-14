package array;

import java.util.ArrayList;

public class MinStepsInfiniteGrid {

	public static void main(String[] args) {
		
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(-7);
		a.add(-13);
		b.add(1);
		b.add(-5);
		int coverPoints = new MinStepsInfiniteGrid().coverPoints(a, b);
		System.out.println(coverPoints);
		

	}

	public int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
		int returnNumber = 0;

		for (int i = 0; i < a.size() - 1; i++) {
			// Calculate difference between 2 consecutive numbers
			int point1x = a.get(i);
			int point1y = b.get(i);

			int point2x = a.get(i + 1);
			int point2y = b.get(i + 1);

			int calculateDifferencex = calculateDifference(point1x, point2x);
			int calculateDifferenceY = calculateDifference(point1y, point2y);

			int max = Math.max(calculateDifferencex, calculateDifferenceY);
			returnNumber += max;

		}

		return returnNumber;
	}

	private int calculateDifference(int point1x, int point2x) {

		if (point1x >= point2x) {
			return point1x - point2x;
		}

		return point2x - point1x;

	}

}
