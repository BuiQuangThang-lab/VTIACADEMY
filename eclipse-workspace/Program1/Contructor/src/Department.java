
public class Department {
   int id;
   String name;
   String leader;

	public Department(int id,String name,String leader) {
		this.id = id;
		this.name = name;
		this.leader = leader;
	}
	
		public static void main(String[] args) {
			Department department =  new Department( 4,"sale", "Thang");
			System.out.println(department.id + " " + department.name + " " + department.leader);

		}

	}
