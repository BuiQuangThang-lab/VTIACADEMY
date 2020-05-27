import java.sql.Date;
import java.util.Scanner;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Date createDate;

	public Group() {
	};

	public Group(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Group(Account creator) {
		super();
		this.creator = creator;
	}

	public Group(int id, String name, Account creator, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
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

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	};
	

}
