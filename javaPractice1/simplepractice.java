package javaPractice1;

public class simplepractice {

	public static void main(String[] args) {
	
		//palindrome
			System.out.println(isPalindrome("madam")); //true
			System.out.println(isPalindrome("ritu")); //false
			System.out.println(isPalindrome("Madam ")); //true
			
		//reverse string
			String name="MyNameIsRituThapa";
			String rev="";
			for(int i=0;i<name.length();i++) {
				rev=name.charAt(i)+rev;
			}
			System.out.println(rev);
		//total vowels in a string
			String name2=name.toLowerCase();
			int count=0;
			for(int i=0;i<name2.length();i++) {
				if(name2.charAt(i)=='a'||name2.charAt(i)=='e'||name2.charAt(i)=='i'||name2.charAt(i)=='o'||name2.charAt(i)=='u') {
					count=count+1;
				}
			}
			System.out.println(count); //7
			
			//reverse an array
			int [] nm= {1,22,333,4444};
			for(int i=nm.length-1; i>=0;i--) {
				System.out.println(nm[i]); // 4444,333,22,1
			}
		
			//create a single string from  different characters
			char [] myname= {'r','i','t','u'};
			String word="";
			for(char nam:myname) {
				word=word+nam;
			}
			System.out.println(word); //prints ritu as a single word
			
		// sum and average from array of numbers
			int [] nums = {2,4,6,8,10};
			int sum=0;
//			for(int i=0;i<nums.length;i++) {
//				sum=sum+nums[i];
//			}
			for(int n:nums) {
				sum=sum+n;
			}
			System.out.println(sum); //30
			int avg=sum/nums.length;
			System.out.println(avg); //6
			
			//"How will you print length of string without using length method."
			String month="january";
			int length=0;
			char [] m = month.toCharArray();
//			for(int i=0;i<m.length;i++) {
//				length=length+1;
//			}
			for(char mm:m) {
				length=length+1;
			}
			System.out.println(length); //7
			
			//print even numbers betn 1 to 10
			for (int i=1; i<=10;i++) {
				if(i%2==0) {
					System.out.println(i); //2,4,6,8,10
				}
			}
			//using while and continue print 10 to 1 and skip 5
			int j=10;
			while(j>0) {
				if(j==5) {
					j--;
					continue;
				}
				System.out.println(j); //10,9,8,7,6, 4,3,2,1 //skips 5
				j--;
			}

	}
		
		//palindrome
		//to check if it's palindrome or not
	//method to return true if string is palindrome
		public static boolean isPalindrome(String str) {
			// String str = "madam";
			//String str = "ritu";
			str=str.toLowerCase().trim(); //this will solve for uppercase "Madam" as well as spaces "Madam "
		//pointers pointing to the beginning and end of the string	
			
		int i=0;
		int j=str.length()-1;
	
		//while  there are characters to compare ie;i<j
			while(i<j) {
				//if there's a mismatch; return false
				if (str.charAt(i)!= str.charAt(j)) {
					return false;
				}
				//increment the first pointer and decrement the other
			i++;
			j--;
		}
			//Given the string is palindrome,then return true
			return true;
		}
	
	//}
}
