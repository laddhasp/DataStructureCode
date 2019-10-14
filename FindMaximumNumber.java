package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by shubhaml on 10/14/2019.
 */
//https://www.interviewbit.com/problems/largest-number/
//Note: Even a stringBuilder is used to reduce the time complexity, in below if we use maxNoStr(string) it will not complete within time
public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
       /* a.add(3);
        a.add(30);
        a.add(34);*/
        a.add(8);
        a.add(89);
        String max = new FindMaximumNumber().findMax(a);
        System.out.println(max);
    }

    public String findMax(List<Integer> a) {

        StringBuilder maxNoStr = new StringBuilder();

        List<String> collect = a.stream().map(s -> String.valueOf(s)).collect(Collectors.toList());
        Collections.sort(collect, (String o1, String o2) ->{
            return (o1+o2).compareTo(o2+o1) >0? -1:1;
        });

        if(collect.get(0) == "0") {
            return "0";
        }
        for (String number:collect) {
            maxNoStr.append(number);
        }

        return maxNoStr.toString();
    }
}
