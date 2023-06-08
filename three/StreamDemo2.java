package three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to calculate the birth year; you have age property in APi ; in UI birth year for the patient is shown
		//here the frontend developer writes calculation to show year by doing current year - age to get birth year 
		//now, we as a tester need to validate whatever UI element the frontend shows usinf FE devloper's calculation will match the object list that we create by write our calculation for the API objects
		
	//for this, we tester will take the collection from Api response into a stream; then you'll add another property "birthyear" ; this is one way
		//(or you can directly assert)
		//for this; you can use ForEach method and whatever you calculate age; you can directly assert inside this ForEach method (do the calculation on APi object and assert it to UI element value). This is called E2E or integration testing
		//after our calculation, we will stream the collection to get a list and validate list of objectsfromApi matched the list.ofpatients in the UI or not
		
		
		//conclusion: we testers have to do calculation on API objects to validate it against UI element(that the FE has written code for calculation)
		//conclusion 2: why Streams used: to workaround with the collections so we can validate elements present in UI as well as different responses from other APIs
		
		//similarly for filtering salary if selecting salry>3000 filter
		//the API will give you all the objects in responses unless you stream the collections of objects to filterout the object which has a ssepcific condition ie; filter salary >3000
		//and then you'll basically have one length of List from your API response objects; and also you can have length of the elements after the sorting from the UI(whose logic written by FE developer); if both length matches; your E2E testing passes
	
	
		//map - when you want to perform operation with every object; you use map
		//forEach -  when you want to print few things; you can use ForEach
		//filter - when you want to filter out from a set of objects; you use filter
		//reduce - when you want to add sum and get exactly one value or solve some expression; you use reduce
	
		
	//  { 
	//   id:1, 
	//   name:"ritu thapa", 
	//   salary:1000, 
	//   country:"Nepal" 
	//    
	//    
	//  } 
		Employee emp1 = new Employee(1,"ritu thapa",1000);
		Employee emp2 = new Employee(2,"kushal thapa",2000);
		Employee emp3 = new Employee(3,"sanjok kunwar",3000);
		Employee emp4 = new Employee(4,"evansh kunwar",4000);
		Employee emp5 = new Employee(5,"samrat thapa",5000);
	
		//adding $10 to all salaries
		List<Employee> emps = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		emps.stream().forEach(emp->System.out.println(emp.salary+10));
		
		//filter
		
		List <Employee> empA = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		List <Employee> above3000 = empA.stream().filter(em->em.salary>3000).collect(Collectors.toList());
		List <String> names = above3000.stream().map(em->em.name).collect(Collectors.toList());
		System.out.println(names);
		
		//reduce //suming up sallaries of all employees to get total salary
		List<Employee> empsC = Arrays.asList(emp1,emp2,emp3,emp4,emp5); 
		int total=0;
		for(Employee e: empsC) {
			//System.out.println(e.salary);
			total = total + e.salary;
		}
		System.out.println(total);
		//above way is manual way
		//now do the sum in automation using reduce
		
		System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
			empsC.stream().mapToDouble(Employee::getSalary).reduce(0,(value1,value2)->value1+value2));
		
		// add the country to every object --- country ====> nepal
		
		List <Employee> empB = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		List<String> empss = empB.stream().map(em->em.country="Nepal").collect(Collectors.toList());;
		System.out.println(empss);
		
		 // increase the salary of every user by 10 % 
		
		List<Employee> empsD = Arrays.asList(emp1,emp2,emp3,emp4,emp5); 
		System.out.println(empsD.stream().map(Employee::hikeCalculated).reduce((value1,value2)->value1+value2));
		
		// unit testing for db
		  // database  =====> api =======> UI 
		
		ArrayList<String> namess = new ArrayList();
		namess.add("ritu");
		namess.add("kushal");
		namess.add("sanjok");
		namess.add("evansh");
		namess.add("madhu");
		namess.add("rojina");
		
		//filter //names starting with r
		namess.stream().filter(name->name.startsWith("r")).forEach(System.out::println);
		
		//map //to capitalize all the names
		namess.stream().map(String::toUpperCase).forEach(System.out::println);
		
	//write manual testcases in excel for the below question
		  // BVA ---- ECP 
	  
	// range  10c -- 1$  ----> 4decimal 
	//  range   2  -- 100 $  --- 3 decimal 
	//  range   100 - 1000 $  --- 2 decimal 
	  
	}

}
class Employee{
	String name;
	int salary;
	int id;
	String country;
	public Employee(int id, String nm, int sal) {
		this.id=id;
		this.name=nm;
		this.salary=sal;
	}
		public int getSalary() {
			return this.salary;
		}
		
		public float hikeCalculated() {
			return (float) (this.salary + this.salary*0.1);
		}
	
}