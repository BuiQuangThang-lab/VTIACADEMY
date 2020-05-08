
public class Account {
    int id;
    String userName;
    String fullName;
	public Account(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	
	}
	public Account(String userName) {
		super();
		this.userName = userName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
    
}
