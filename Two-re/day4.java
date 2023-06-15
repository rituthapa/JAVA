package Two;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program 1: substring
		// variable.substring(beginningindex,endindex) 
		// begginning indexvalue included; endindexvalue is not included in output
		String line = "fun filled games";
		System.out.println(line.substring(4)); // filled games, prints evrything at 4th index and after
		System.out.println(line.substring(4,7)); //fil 
		
		String country="nepal";
		String c1= country.substring(0,3);  //nep
		System.out.println(c1);
		
		//program 2: join
		String email1="rits_princess";
		String email2="yahoo";
		String email3=".com";
		
		String email= String.join("@", email1, email2, email3);//join will join string together by adding the character assigned between each string
		System.out.println(email);
		
		String a="ritu";
		String b="thapa";
		String c="kunwar";
		String name= String.join("-",a,b,c);//joins a b and c string by -
		System.out.println(name);
		
		String x1="java";
		String x2="is";
		String x3="fun";
		System.out.println(String.join(x1,x2,x3));//first thing join the latter two //isjavafun
		System.out.println(String.join(" ",x1,x2,x3));// space(first thing) joins the other three
		
		//program 3: indexOf 
		//(gives index of first occurrence of the character requested from the position requested
		//variablename.indexOf('character', position from where you want)
		//              0123456
		String month = "january";
		int m=month.indexOf('u');
		int m1=month.indexOf('a',5);//1 //(a,0) output is 1 as well
		//if ('a',2),or a,3 or a,4 its 4; 
		//if a,5  || a,6; there is no 'a' at index5 or later; so nothing matches; so output is -1
		System.out.println(m);
		System.out.println(m1);
		 
		//program 4: trim 
		//removes spaces from beginning and end of string(rest value remains same) and generates new string keeping the original string value
		//To return a new string with whitespace trimmed from just one end, use trimStart() or trimEnd()
		String x=" this is so fun ";
		String y= x.trim();
		System.out.println(y); //"this is so fun" without front and end spaces
		//now, if you want to remove all spaces, replace all space" " with no-space""
		String z=x.replaceAll(" ","");
		 System.out.println(z);
		//program 5: split
		 String txt="I am learning java";
		 String [] txt1= txt.split(" "); //[I,am,learning,java]
		 for (int i=0; i<txt1.length; i++) {
			 System.out.println(txt1[i]);
		 }
		 
		 //program 6: boolean data type with method isempty()
		  String firstname ="ritu";
		  String lastname="";
		  
		  boolean n=firstname.isEmpty();
			  System.out.println(n);
		  
			  boolean n2=lastname.isEmpty();
			  System.out.println(n2);
			  
	
			  
			  
	}

}
