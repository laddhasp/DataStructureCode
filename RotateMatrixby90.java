package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateMatrixby90 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		new RotateMatrixby90().rotate(a);
	}

	public void rotate(ArrayList<ArrayList<Integer>> a1) {

		// TODO:: Observe how did this?
		Integer[][] a = a1.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);
		int N = a1.size();
		for (int i = 0; i < a1.size() / 2; i++) {
			for (int j = i; j < N - i - 1; j++) {

				// Swap elements of each cycle
				// in clockwise direction
				int temp = a[i][j];
				a[i][j] = a[N - 1 - j][i];
				a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
				a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
				a[j][N - 1 - i] = temp;
			}
		}
		// TODO:: Observe how did this?
		List<List<Integer>> collect = Arrays.stream(a).map(Arrays::asList).collect(Collectors.toList());

		a1 = new ArrayList(collect);

	}

}
