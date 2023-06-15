package Two;

import java.util.Arrays;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = { { 12, 22, 32 }, { 44, 55, 66 } };
		for (int i = 0; i < nums.length; i++) {
			int[] nums1 = nums[i];
			// System.out.println(nums1); //this gives the reference
			String a = Arrays.toString(nums1);
			System.out.println(a);
			for (int i1 = 0; i1 < nums1.length; i1++) {
				System.out.println(nums1[i1]);
			}
		}
		for (int[] j : nums) {
			// System.out.println(j);
			for (int k : j) {
				System.out.println(k);
			}
		}

		// three dimensional array [][][]

		int numbers[][][] = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 75, 85, 95 } } };

		for (int[][] i2 : numbers) {
			for (int[] j2 : i2) {
				for (int k2 : j2) {
					System.out.println(k2);
				}
			}

			// another example
			String month[][][] = { { { "january", "february", "march" }, { "april", "may", "june" } },
					{ { "july", "august", "september" }, { "october", "november", "december" } } };

			for (int i = 0; i < month.length; i++) {
				//System.out.println(month[i]);
				String[][] mnths = month[i];
				for (int j = 0; j < mnths.length; j++) {
					String[] halfyear = mnths[j];
					for (int k = 0; k < halfyear.length; k++) {
						System.out.println(halfyear[k]);
					}

				}
			}
		}

		int [][] number = {{40,50,60},{70,80,90}};
		number[1][1]=99; //to update the value of 80 to 99
		
		int[][][] n= {
				{
				{1,2,3},
				{4,5,6},
				{7,8,9}
				},
				{
					{11,22,33},
					{44,55,66},
					{77,88,99}
				}
		};
		for (int [][]o:n) {
			for (int []p:o) {
				for (int q:p) {
					System.out.println(q);
				}
			}
		}
		
		
		
		
	}
}
