package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by shubhaml on 10/11/2019.
 */
public class NobalInteger {
    public static void main(String[] args) {
        Integer a[] = { -4, -2, 0,-1,-6};
        Integer result = new NobalInteger().isNobleInteger(Arrays.asList(a));
        System.out.println(result);
    }

    public int isNobleInteger(List<Integer> A) {

        Collections.sort(A);
        if(A.get(A.size()-1) == 0) {
            return 1;
        }
        for (int i = 0; i <A.size()-1 ; i++) {
            if(A.get(i+1) != A.get(i) && A.get(i) == A.size()-i-1) {
                return 1;
            }
        }
        return -1;
    }
}
