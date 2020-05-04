package facebook.vti.entity;

public class Department {
	private int id;
	private String name;
	private String leader;
	private int numberphone;

	public Department(int id, String name, String leader, int numberphone) {
		super();
		this.id = id;
		this.name = name;
		this.leader = leader;
		this.numberphone = numberphone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public int getNumberphone() {
		return numberphone;
	}

	public void setNumberphone(int numberphone) {
		this.numberphone = numberphone;
	}

}
