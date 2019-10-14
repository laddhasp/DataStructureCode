package array;

import java.util.ArrayList;

public class PascalTriangle {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> solve = new PascalTriangle().solve(0);
		System.out.println(solve);
	}
	
	 public ArrayList<ArrayList<Integer>> solve(int A) {
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<>(A);
		if(A == 0) {
			return returnList;
		}
		
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		returnList.add(arrayList1);

		for (int i = 1; i < A; i++) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(1);
			returnList.add(arrayList);

			ArrayList<Integer> previousList = returnList.get(i - 1);
			for (int j = 0; j < previousList.size() - 1; j++) {
				arrayList.add(previousList.get(j) + previousList.get(j + 1));
			}

			arrayList.add(1);
		}
		return returnList;
	        
	 }
}
