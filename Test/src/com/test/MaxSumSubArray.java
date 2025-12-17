package com.test;

/*
 arra[] ={1,2,3,4,5}
  subArray=3
     6, 9, 12
     
     //12
 * */
public class MaxSumSubArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int subArray = 3;
		
		int length = arr.length;
		int sum = 0;
		for(int i=0; i<subArray; i++) {
			sum+= arr[i]; //6
		}
		int sum1 = sum;
		
		for(int i=subArray; i<length; i++) {
			sum+=arr[i]-arr[i-subArray]; //6+4-arr[4-3]
			sum1 = Math.max(sum1, sum);
		}
		
	}
}


/// use stream api, find the emp belong to hr, find the sal for all hr depet
///
///
///EmpList - id, name, salary , dept
/*
 * empList.stream().
 *.filter(e- > "HR".equalsIgnoreCase(e.getDepartment)!= null)
 *.mapToDouble(Emp::getSalary)
 *.sum();
 * 
 */


