package three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//streams
		//map;//filter//reduce//
		
		//program 1 //age + 2 //adding 2 to the age

		Person a = new Person("ritu","thapa",27,"pokhara");
		Person b = new Person("sanjok","kunwar",33,"naudada");
		Person c = new Person("jyoti","khatri",36,"kanpur");
		Person d = new Person("kushal","thapa",25,"pokhara");
		Person e = new Person("sujan","kc",39,"kathmandu");
		
		//above is the collection of objects
		// {
		//	"firstname":"ritu"
		//	"lastname":"thapa"
		//	"age":27;
		//	"city":"pokhara"
		// }
		
		//above is object 'a' of Person datatype'; similarly; object b, object c,....
		//we get these collections from Api response
		
		//we validate the response from Api matched the UI by calculating the scenario for API objects and the values we get from the calculation on apiresponses(objects/data in api response) to the UI element (values we get as a result of the calculation already done by frontend developer) 
		//inside the map emthod of stream , we can write the validation as well; the validation which includes list of calculated object verifying with UI elementresult 
		List <Person> students = Arrays.asList(a,b,c,d,e); //there's a class called Arrays which has method asLIst which lists arrays in a list
		//students age + 2 should be the value ; how to do that
		//maps
		
		List <Integer> ageplus2 = students.stream().map(x -> x.age+2).collect(Collectors.toList());
		System.out.println(ageplus2);
		
		
		//program 2 // if an array has [2,3,4,5] , get every element multiply by 5
		
		List <Integer> nums = Arrays.asList(2,3,4,5);
		System.out.println(nums);
		List <Integer> numstimes5 = nums.stream().map(x->x*5).collect(Collectors.toList());
		System.out.println(numstimes5);
		
		//program 3 //table of 2 with given element of array
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers);
		List<Integer> tableof2 = numbers.stream().map(x->x*2).collect(Collectors.toList());
		System.out.println(tableof2);
		
		//program 4 
		//get name starts with A //ie; filter by names starting with 'A' and names ending with 'it'
		List <String> names = Arrays.asList("amit","samit","pramit","amrit","binita");
		List <String> nameswithA = names.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
		System.out.println(nameswithA);
		List<String> endswithit= names.stream().filter(x->x.endsWith("it")).collect(Collectors.toList());
		System.out.println(endswithit);
		
		//cithwithP
		List <Person> students2 = Arrays.asList(a,b,c,d,e);
		List<Person> citywithP = students2.stream().filter(x->x.city.equals("pokhara")).collect(Collectors.toList());
		System.out.println(citywithP); //this will give you reference only
		
		System.out.println(citywithP.get(0).firstname);
		System.out.println(citywithP.get(1).firstname);
		
		List <String> name = citywithP.stream().map(x->x.firstname).collect(Collectors.toList());
		System.out.println(name);
	}

}
class Person{
	String firstname;
	String lastname;
	int age;
	String city;
	
	public Person(String fn,String ln, int age, String ct) {
		this.firstname=fn;
		this.lastname=ln;
		this.age=age;
		this.city=ct;
	}
}