package com.javapractice;

import java.util.Arrays;
import java.util.Collections;

public class SortingDescending {

	public static void main(String[] args) {
		Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
		  
        // Sorts arr[] in descending order 
         Arrays.sort(arr,Collections.reverseOrder());
  //Arrays.sort(arr,Collections.reverseOrder());
       System.out.println(Arrays.toString(arr));
	}

}
