package Two;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array used to assign multiple values (of same data type though) to a single memory/variable

		// double array

		int[][] data = { { 17, 18, 19 }, { 50, 60, 70 } };
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		System.out.println(data[1][2]);

		// for each loop

		int[] num = { 1, 2, 3, 4 };
		for (int a : num) {
			System.out.println(a);
		}

		char[] name = { 'r', 'i', 't', 'u' };
		for (char n : name) {
			System.out.println(n);
		}

		String word = "";
		char[] name1 = { 'r', 'i', 't', 'u' };
		for (char n : name1) {
			word = word + n;
		}
		System.out.println(word);

		// sum and average
		int sum = 0;
		int[] numbers = { 20, 40, 60, 80 };
		for (int i : numbers) {
			sum = sum + i;
		}
		System.out.println(sum);
		int avg = sum / numbers.length;
		System.out.println(avg);
		
		
		//sum and avg
		int sumx =0;
		int numb []= {10,20,30,40,50};
		for (int i = 0; i<numb.length; i++) {
			sumx = sumx + numb[i];
		}
		System.out.println(sumx);
		avg=sumx/numb.length;
		System.out.println(avg);
		
				
	}
}
