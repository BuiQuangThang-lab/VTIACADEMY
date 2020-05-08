package Assignment4.keThua_Constructor;

public class HighSchoolStudent extends Student {
    String clazz;
    String desiredUniversity;
	public HighSchoolStudent(String name, int id) {
		super(name, id);
		
	}
	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
     
}
