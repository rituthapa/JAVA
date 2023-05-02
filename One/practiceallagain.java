package One;

public class practiceallagain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a1, b1 ,c1
		int a1 = 21;
		int b1 = 41;
		int c1 = 61;
		if (a1 > b1 && a1 > c1) {
			System.out.println("a1 is greater");
		} else if (b1 > c1 && b1 > a1) {
			System.out.println("b1 is greater");
		} else {
			System.out.println("c1 is greater");
		}

		if (a1 > b1) {
			if (a1 > c1) {
				System.out.println("a1 is greater");

			} else if (b1 > a1) {
				if (b1 > c1) {
					System.out.println("b1 is greater");
				}
			} else {
				System.out.println("c1 is greater");
			}
		}
		//chararray example 2
				String nm="kushal";
				char[] ch= nm.toCharArray(); //[k,u,s,h,a,l]
				for (int i=0;i<ch.length;i++) {
					System.out.println(ch[i]);
				}
				//char loop using for each
				String rev="";
				for(char c:ch) {
					System.out.println(c);
					rev=c+rev;
				}
				System.out.println(rev);
				
		// sum in array
		int sum1=0;
		int number []= {10,20,30};
		for (int j:number) {
			sum1=sum1 + j;
		}
		System.out.println(sum1);
		
		int sum = 0;
		int[] numbers = { 11, 22, 33 };
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);

		// for loop
		// table of 4 in reverse
		for (int i = 40; i >= 4; i = i - 4) {
			System.out.println(i);
		}

		// for loop
		// even numbers between 1 to 50
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				if (i==20) {
					continue;   // when i=20 it will continue to looping without printing 20; so will skip 20
				}
				System.out.println(i);}
			if (i==40) {
				break; // when i=40; loop breaks so prints 2 to 40 even number ; not until 50, bcoz breaks at 40
			}
		}
		
		
		//for loop
		//odd numbers 1 to 50; skip 11; break at 25
		for(int i=1;i<=50;i++) {
			if( i%2!=0) {
				if(i==11) {
					continue;
				}
				System.out.println(i);
				if(i==25){
					break;
				}
				
			}
		}
		
		//while loop table of 3
		int i=3;
		while (i<= 30) {
			System.out.println(i);
		i=i+3;
		}
		
		 //ternary operator
//		int q = 20;
//		int r = 100;
//		boolean max=(q>r) ?System.out.println("q is greater"):System.out.println("r is greater");
		
	}
	}