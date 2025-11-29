package com.guruprasad.arrays;

public class arraysactivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {100,20,300,40,50};
		
		
		for(int i=0;i<arr1.length;i++) {
			if (arr1[i+1] < arr1[i]) {
				int temp = arr1[i];
				arr1[i] = arr1[i+1];
				arr1[i+1] = temp;
		
			}
			System.out.println(arr1[i]);
			
		}
	}

}
