package three;

import java.util.ArrayList;
import java.util.HashSet;

public class collections3hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet - will not repeat duplicates
		
		HashSet<String> siblings= new HashSet <String>();
		
		//add element
		siblings.add("ritu");
		siblings.add("kushal");
		siblings.add("garima");
		siblings.add("rojina");
		siblings.add("gaurav");
		
		System.out.println(siblings);
		//size
		System.out.println(siblings.size());
		
		//remove elements
		siblings.remove("ritu");
		System.out.println(siblings);
		System.out.println(siblings.size());
		siblings.add("binita");
		siblings.add("bibek");
		System.out.println(siblings);
		
		//retrieving each element by for each loop only
		for(String sib:siblings) {
			System.out.println(sib);
		}
		//can't retrieve each value on its own because no index or key to refer the values back to
		//for example, on arraylist, one value is retrieved based on its index number
		//and hashmap, value retrieved based on its key(what value the key refers to)
		//but in HashSet, you dont have anything to refer back to your values, so can't retrieve
		//also can't update or change the value; updating here means adding new data and if you want to change it, you delete/remove it and add another new data
		
			
			//contains: return boolean type
		boolean aa = siblings.contains("kushal");
		boolean bb = siblings.contains("ritu");
		
		System.out.println(aa);
		System.out.println(bb);
		
		ArrayList<String> cousins= new ArrayList<String>();
		cousins.add("kushal");
		cousins.add("ritu");
		cousins.add("binita");
		
		//now the question is to print "element is in set" if element of arraylist is included in element-set of hashset
		
		for (int i=0; i<cousins.size();i++) {
			if (siblings.contains(cousins.get(i))) { //()statement inside if returns boolean value either true or false
				System.out.println(cousins.get(i)+" is included in " + siblings); //prints this if true
			}
			else {
				System.out.println(cousins.get(i) +" is not included in " + siblings); //prints this if false
			}
		}
		
			
		
		//clear
				siblings.clear();
					System.out.println(siblings);
		
	}

}
