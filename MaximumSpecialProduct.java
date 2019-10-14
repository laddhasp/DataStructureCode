package array;

import java.util.ArrayList;
import java.util.List;

//
public class MaximumSpecialProduct {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		/*
		 * a.add(5); a.add(9); a.add(6); a.add(8);
		 * 
		 * a.add(6); a.add(4); a.add(6); a.add(9);
		 * 
		 * a.add(5); a.add(4); a.add(9);
		 */
		a.add(6);
		a.add(5);
		a.add(4);
		a.add(9);

		a.add(9);
		a.add(6);
		a.add(5);
		a.add(4);

		a.add(5);
		a.add(9);
		a.add(9);

		int maxSpecialProduct = new MaximumSpecialProduct().maxSpecialProduct(a);
		System.out.println(maxSpecialProduct);
	}

	public int maxSpecialProduct(ArrayList<Integer> A) {

		int product = 0;

		List<Integer> leftSpecialValueList = new ArrayList<>();
		leftSpecialValueList.add(0);
		List<Integer> rightSpecialValueList = new ArrayList<>();
		rightSpecialValueList.add(0);

		for (int i = 0; i < A.size(); i++) {
			int leftSpecialValue = 0;

			for (int j = i - 1; j > 0; j--) {
				if (A.get(j) > A.get(i)) {
					leftSpecialValue = j;
					break;
				}
			}
			leftSpecialValueList.add(leftSpecialValue);

			int rightSpecialValue = 0;
			for (int j = i + 1; j < A.size(); j++) {
				if (A.get(j) > A.get(i)) {
					rightSpecialValue = j;
					break;
				}
			}
			rightSpecialValueList.add(rightSpecialValue);
		}

		for (int i = 0; i < leftSpecialValueList.size(); i++) {
			int j = leftSpecialValueList.get(i) * rightSpecialValueList.get(i);
			product = Math.max(product, j);
		}

		return product;
	}

}
