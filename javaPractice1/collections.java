package javaPractice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//arraylist
		//create - add(value)
		//retrieve - get(index)
		//update- set(index,value) --->get(index)
		//delete - remove(index)
		//deleteall - clear(referenceObject) - to clear everything inside that reference
		
		//hashmap
		//create- put(key,value)
		//retrieve - get(key)-->gives you value ;.keyset method to get all keys in array; .values method to get all values in array; to print individually many results: inside foreach loop, get(keyset), get(value)
		//update- put(key, new value)
		//delete- remove(key)
		//deleteAll- clear(objectname)
		
		//hashSet (can't add anything duplicate)
		//create- add(value)
		//delete- remove(value)
		//deleteAll - clear(objectname)
		
		//retrieve- using iterator only; can't retrieve single value using get cause can't refer to a specific value by index or key //retreive all values in set using for each loop
		//update- remove the previous value and add new value (to Update); bcoz can't update single value using get cause can't refer to a specific value by index or key
		
		//can check the value using contains that returns you boolean type
		
		
		
		///////ArrayList//////////////////////
		
//		ArrayList <String> colors = new ArrayList <String> ();
//		colors.add("red");
//		colors.add("blue");
//		colors.add("green");
//		colors.add("yellow");
//		System.out.println(colors);
//		
//		System.out.println(colors.get(0));
//		System.out.println(colors.get(1));
//		System.out.println(colors.get(2));
//		System.out.println(colors.get(3));
//		
//		for(int i=0;i<colors.size();i++) {
//			System.out.println(colors.get(i));
//		}
//		
//		colors.set(1, "navy");
//		System.out.println(colors.get(1));
//		
//		colors.remove(2);
//		System.out.println(colors);
//		
//		colors.clear();
//		System.out.println(colors);
//		
		/////////////HashMap////////////////////
		
//		HashMap <String,String> customerinfo = new HashMap <String,String> ();
//		customerinfo.put("firstname", "ritu");
//		customerinfo.put("lastname", "thapa");
//		customerinfo.put("age","27");
//		customerinfo.put("gender","female");
//		System.out.println(customerinfo);
//		System.out.println(customerinfo.size());
//		
//		System.out.println(customerinfo.get("age"));
//		System.out.println(customerinfo.get("lastname"));
//		System.out.println(customerinfo.keySet()); //to print all keys
//		System.out.println(customerinfo.values()); //to print all values
//		
//		for(String info:customerinfo.keySet()) {
//			System.out.println(info); //returns keys only
//			System.out.println(customerinfo.get(info)); //here info gives you all keys; so get(info) gives you values
//		}
//		
//		for (String info2:customerinfo.values()) {
//			System.out.println(info2); //prints you values
//		}
//		
//		for (String infoall:customerinfo.keySet()) {
//			System.out.println(infoall + " " + customerinfo.get(infoall)); //where  infoall means keys and customerinfo.get(infoall) is the value
//		}
//		customerinfo.put("lastname","kunwar");
//		System.out.println(customerinfo.get("lastname"));
//		
//		customerinfo.remove("gender");
//		System.out.println(customerinfo);
//		
//		customerinfo.clear();
//		System.out.println(customerinfo);
		
		///////////////HashSet/////////////////////
		HashSet <String> food = new HashSet<String>();
		food.add("momo");
		food.add("chowmein");
		food.add("curry");
		System.out.println(food);
		System.out.println(food.size());
		
		food.remove("curry");
		food.add("goatcurry");
		
		for(String fooditems: food) {
			System.out.println(fooditems);
		}
		
		//OR //to get a specific items from the array, use iterator method 
		
//		Iterator<String> ite = food.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		
		Iterator<String> ite = food.iterator();
		while(ite.hasNext()) {
			if(ite.next().startsWith("c")) {
				ite.remove();
			}
		}
		System.out.println(food);
		
		food.add("bhutan");
		food.add("soup");
		food.add("thali");
		System.out.println(food);
		
		//you can use .contains method for hashset items when using it with another collection
		
		//now create an arraylist with spicyfoods only and see which are included in food set
		ArrayList <String> spicyfood= new ArrayList<String>();
		spicyfood.add("goatcurry");
		spicyfood.add("bhutan");
		spicyfood.add("chickencurry");
		
		System.out.println(spicyfood);
		
		
			for(int i=0; i<spicyfood.size();i++) {
				if(food.contains(spicyfood.get(i))) {
					System.out.println(food + "contains this " + spicyfood.get(i));
				}
				else {
					System.out.println(food + "doesnt contain this " + spicyfood.get(i));
				}
			}
		
			//windowhandles
																				// String parenttab= driver.getwindowHandle();
		//	Set <String> tabs = driver.getWindowHandles();
		//	Iterator<String> itab = tabs.iterator();
			
		//	String firstTab = itab.next();
		//	String secondTab = itab.next();
			
			//to switch between first and second tab
			//		driver.switchto.window(firstTab);
			//		driver.switchto.window(secondTab);
			
////																					while(itab.hasNext()) {
////																						String childtab = itab.next();
////																						if(!parenttab.eqauls(childtab)) {
////																							driver.switchto.window(childtab)
//				}
//			}
	}

}
