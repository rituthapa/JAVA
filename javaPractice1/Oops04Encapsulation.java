package javaPractice1;

public class Oops04Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Encapsulation: it is nothing but Defining a Class
	
		        Person person = new Person();
		        person.setName("John");
		        person.setAge(30);
		 
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());

		    }

		}
		class Person {
		    private String name;
		    private int age;
		    
		    public void setName(String name){
		        this.name=name;
		    }
		  
		    public void setAge(int age){
		        this.age=age;
		    }
		    public String getName(){
		        return name;
		    }
		    public int getAge(){
		        return age;
		    }   
		
	}


