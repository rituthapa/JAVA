package three;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class collections1arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//collections: arraylist,hashmap,hashset
		//collections: is a package that has in-built classes like arraylist,hashmap,hashsetetc.
		//collections: two types; ordered and non-ordered
		//arraylist: ordered collection because it's based on order of datas; like the position or index of the element
		//SEt and map: are non-ordered collection; because it's not based on order of datas; like the position or index of the element

		//Array has fixed set of values
		//Arraylist can modify the size of elements
		//object of these classes (like arraylist cArrayList<E> properties and methods
		
		ArrayList<String> fruits= new  ArrayList<String>();
		// now you can do add, retrieve, update, delete from this collection class named arraylist and also apply for, foreach loop
		//similarly using different method specific to each class ; yiu can perform these four functions plus apply for loop to get individual value
		
		//add 
		//sysntax: classref.add(give the value)
		fruits.add("apples");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("kiwi");
		
		System.out.println(fruits);
		
		//retrieve 
		//syntax: Classref.get(indexnumber)
		System.out.println(fruits.get(0)); //apples is  at index 0 
		System.out.println(fruits.get(4)); //kiwi because kiwi at index 4
		String a=fruits.get(3);
		System.out.println(a);
		
		for (int i=0; i<fruits.size(); i++) {
			System.out.println(i);
			System.out.println(fruits.get(i));
		}
		
		//update 
		//Classref.set(index,new value); then retrieve it with get(indexnumber) to check
		fruits.set(4, "blueberries"); //kiwi will be updated to blueberries now at index 4
		System.out.println(fruits.get(4));
		
		for (String fr:fruits) {
			System.out.println(fr);
		}
		
		//delete
		//syntax: classref.remove(index number)
		fruits.remove(1); //removes banana
		System.out.println(fruits);
		
		//clear //to completely clear or delete everything/all values
		fruits.clear();
		System.out.println(fruits); //output is [] only // no values inside it
	}

}
