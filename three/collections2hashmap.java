package three;

import java.util.HashMap;

public class collections2hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap : stores elements in key value format

		// ["ritu","thapa",27,25]
		// you dont know which is firstname or lastname, or you dont know which is age,
		// which is rollno
//		[firstname:"ritu",
//		 lastname:"thapa",
//		 age:27,
//		 rollno:25]
		// defining as key:value makes it easier to understand what the value refers to
		// what thing

		HashMap<String, String> fruitcolor = new HashMap<String, String>();
		// add
		fruitcolor.put("strawberry", "red");
		fruitcolor.put("blueberry", "blue");
		fruitcolor.put("kiwi", "green");
		fruitcolor.put("blackberry", "black");
		fruitcolor.put("banana", "yellow");
		System.out.println(fruitcolor);

		// retrieve
		System.out.println(fruitcolor.get("kiwi"));
		System.out.println(fruitcolor.get("strawberry"));
		System.out.println(fruitcolor.keySet());
		System.out.println(fruitcolor.values());

		// for each loop to get key values individually
		for (String key : fruitcolor.keySet()) {
			System.out.println(key);
			System.out.println(fruitcolor.get(key)); // this is same as for each loop for values; gives values
														// individually
		}
		//for loop can't be used in hashmap and hashset collectibles because doesnt store eleements in order by index
		//use for reach only for looping

		for (String val : fruitcolor.values()) {
			System.out.println(val);
		}

		for (String fc : fruitcolor.keySet()) {
			System.out.println(fc + " " + fruitcolor.get(fc));
		}
		// update
		fruitcolor.put("grape", "black"); // when key is changed, new element is added with put() method
		System.out.println(fruitcolor);
		fruitcolor.put("banana", "light green"); // when value is changed, new value is updated on that key with the
													// same put() method
		System.out.println(fruitcolor);

		// size
		System.out.println(fruitcolor.size());

		// delete
		fruitcolor.remove("blueberry");
		System.out.println(fruitcolor);

		// clear
		fruitcolor.clear();
		System.out.println(fruitcolor);
		System.out.println(fruitcolor.size());

		HashMap<Integer, String> skincare = new HashMap<Integer,String>();
		
		// add
		skincare.put(1, "cleansing");
		skincare.put(2, "toning");
		skincare.put(3, "moisturizing");
		skincare.put(4, "sunscreening");
		System.out.println(skincare);
		
		//retrieve
		System.out.println(skincare.get(1));
		System.out.println(skincare.get(4));
		
		//update
		skincare.put(1,"double cleansing");
		System.out.println(skincare.get(1));
		
		//delete
		skincare.remove(4);
		System.out.println(skincare);
		
		//size
		System.out.println(skincare.size());
		
		//retrieving keys separately and values separately and individually using for each loop
		System.out.println(skincare.keySet());
		for (Integer key:skincare.keySet()) {
			System.out.println(key);
			System.out.println(key + " "+ skincare.get(key));
		}
		
		System.out.println(skincare.values());
		for (String val:skincare.values()) {
			System.out.println(val);
			System.out.println(skincare.keySet() + " "+ val); //output [1,2,3] double clensing
																//     [1,2,3] toning
																//     [1,2,3] moisturizing				
			//System.out.println(skincare.keySet(val) + " "+ val);//error: this is not possible
		}
	}
}
