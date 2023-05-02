package three;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorpart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(50);
		marks.add(20);
		marks.add(6);
		marks.add(14);
		marks.add(26);
		System.out.println(marks);

		Iterator<Integer> nn = marks.iterator();
		while (nn.hasNext()) {
			if (nn.next() < 15) {
				nn.remove();
			}
		}
		System.out.println(marks);

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Honda");

		System.out.println(cars);
		
		Iterator<String> cc = cars.iterator();
		
		System.out.println(cc.next());
		System.out.println(cc.hasNext());
		System.out.println(cc.next());

		while (cc.hasNext()) {
			System.out.println(cc.next());
		}
	}
}
