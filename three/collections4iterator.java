package three;

import java.util.ArrayList;
import java.util.Iterator;

public class collections4iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist
		//HashMap
		//HashSet
		//LinkedList
		//Iterator
		
		ArrayList<String> countries= new ArrayList<String>();
		countries.add("japan");
		countries.add("china");
		countries.add("nepal");
		countries.add("india");
		countries.add("usa");
		
		//iterator itself is a method inside the collection(arraylist,hashset)
		//Tterator<> class is defined now
		//the elements doesn't have index or key to refer back to , so you get the element by iteration or going next to reach to one element after another
		//next() method of iterator to get the first value and then doing next method again and again to get every next value
		//hasNext() is a boolean type; gives true if there's next value, if no next value is present, gives false
		
		Iterator<String> it = countries.iterator();
		//Iterator [] countries = ["india","nepal","usa","canada","china"];
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		
		
		//to print all elements one after another using iterators
		//use while loop to do so
		//for iterator, there is no method to know size(like in arraylist or length(in array), so cant use for loop
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
