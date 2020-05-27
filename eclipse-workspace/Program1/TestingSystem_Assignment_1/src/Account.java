import java.util.Date;
import java.util.Scanner;

public class Account {
	private int accountID;
	private String email;
	private String userName;
	private String fullName;
	private Gender gender;
	private Group[] groups;
	private Department department;
	private Position position;
	private Date createDate;
	ListGroup listgroup;

	public Account() {

	}

	public Account(int accountID, String email, String userName, String fullName, Gender gender, Group[] groups,
			Department department, Position position, Date createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.gender = gender;
		this.groups = groups;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position postionID) {
		this.position = postionID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	};

	public void nhapAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào thông tin Account");
		System.out.println("Nhập vào account id: ");
		setAccountID(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập vào email: ");
		setEmail(sc.nextLine());
		System.out.println("Nhập vào userName: ");
		setUserName(sc.nextLine());
		System.out.println("Nhập vào fullName: ");
		setFullName(sc.nextLine());

		System.out.println("Nhập vào Gender: ");
		String gender = sc.nextLine();
		if (gender.equals("Male")) {
			setGender(Gender.Male);
		} else if (gender.equals("Female")) {
			setGender(Gender.Female);
		} else {
			setGender(Gender.Unknown);
		}

		Department department = new Department();
		department.nhapDepartment();
		setDepartment(department);
		
		Position position = new Position();
		position.nhapPosition();
		setPosition(position);

		listgroup = new ListGroup();
		listgroup.Nhap();
		groups = listgroup.groups;

		setCreateDate(java.util.Calendar.getInstance().getTime());

	}

	public void hienAccount() {
		System.out.println("Account id: " + getAccountID());
		System.out.println("Account name: " + getFullName());
		System.out.println("Gender: " + getGender());
		System.out.println("Email: " + getEmail());
		System.out.println("Postion: " + position.getPositionName());
		System.out.println("Department name: " + department.getDepartmentName());

		listgroup.HienThi();

	}
	

}
