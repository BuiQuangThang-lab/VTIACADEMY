import java.util.Date;
import java.util.Scanner;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Date createDate;
	Account accounts;

	public Group(int id, String name, Account creator, Date createDate, Account accounts) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	public Group() {
	};

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
	}

	public Account getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}

	public void nhapGroup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========Nhập thông tin của Group =========");
		System.out.println("Nhập group id: ");
		setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập group name: ");
		setName(sc.nextLine());
		setCreateDate(java.util.Calendar.getInstance().getTime());
	}

	public void hienGroup() {
		System.out.println("group id: " + getId());
		System.out.println("group name: " + getName());
		System.out.println("group createDate: " + getCreateDate());
	}

}
