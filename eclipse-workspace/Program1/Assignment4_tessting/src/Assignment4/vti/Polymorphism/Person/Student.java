package Assignment4.vti.Polymorphism.Person;

import java.util.ArrayList;

public class Student extends Person {
	private int maSV;
	private float avg;
	private String email;

	public Student(int maSV, float avg, String email) {
		super();
		this.maSV = maSV;
		this.avg = avg;
		this.email = email;
	}

	public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, int maSV, float avg, String email) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		this.maSV = maSV;
		this.avg = avg;
		this.email = email;
	}

	public Student() {
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập vào mã sinh viên: " );
		setMaSV(sc.nextInt());
		System.out.println("Nhập vào email: ");
		setEmail(sc.nextLine());
		System.out.println("Nhập vào điểm trung bình: ");
		setAvg(sc.nextFloat());
	}
	
	@Override
	public void hien() {
		super.hien();
		System.out.println("Mã sinh viên: " + getMaSV());
		System.out.println("Email: " + getEmail());
		System.out.println("Điểm trung bình: " + getAvg());
		
	}
	ArrayList<Student> listStudent = new ArrayList<>();
	
	public void inputInfo() {
		System.out.println("Nhập số Student muốn nhập: ");
		int n = sc.nextInt();
		Student s = new Student();
		for (int i = 0; i < n; i++) {			
			s.Nhap();
			listStudent.add(s);
		}
	}
	
	@Override
	public void showInfo() {
		for(Student s : listStudent) {
			s.hien();
		}
	}
}
