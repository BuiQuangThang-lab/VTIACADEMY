package Assignment4.keThua_Constructor;

public abstract class Student extends Person {
    int id;
	public Student(String name, int id) {
		super(name);
		this.id = id;
	}
	public Student(String name) {
		super(name);
		
		
	}
    
  
}
