package doi_tuong;

public class Group {
	private int id;
	private String groupName;
	private Account account;
	
    public Group() {
    	
    }
    
    public Group(int id, String groupName, Account account) {
    	this.id = id;
    	this.groupName = groupName;
    	this.account = account;
    	
    }

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
