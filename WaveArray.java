package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.interviewbit.com/problems/wave-array/
	
public class WaveArray {
	 public ArrayList<Integer> wave(ArrayList<Integer> A) {
	        
	        Collections.sort(A);
	        Integer[] array = A.toArray(new Integer[A.size()]);
	        
	        for(int i=0; i<A.size()-1; i = i+2) {
	            
	            int temp = array[i+1];
	            array[i+1] = array[i];
	            array[i] = temp;
	                      
	        }
	        ArrayList<Integer> asList = new ArrayList(Arrays.asList(array));
	        return asList;
	    
	    }
    
    public static void main(String[] args) {
    	ArrayList<Integer> A = new ArrayList<>();
    	A.add(5);
    	A.add(1);
    	A.add(3);
    	A.add(2);
    	A.add(4);
		
    	List<Integer> wave = new WaveArray().wave(A);
    	System.out.println(wave);
    	
		
	}
}
