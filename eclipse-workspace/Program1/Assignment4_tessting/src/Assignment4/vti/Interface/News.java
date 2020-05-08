package Assignment4.vti.Interface;

import java.util.ArrayList;
import java.util.Scanner;

import Assignment4.vti.inheritance.Person;

public class News implements INew {
    private int id;
    private String title;
    private String publicDate;
    private String author;
    private String content;
    private float averangeRate;
    private ArrayList<News>arrNews; 
    
    Scanner sc = new Scanner(System.in);
    @Override
	public void Display() {
    	News n = new News();
		System.out.println(n.getTitle()+ n.getPublicDate()+n.getAuthor()+n.getContent()+n.getAverangeRate());
		
	}

	@Override
	public float Calculate() {
		float sum = 0;
		int[] Rates;
		Rates = new int[3];
		for(int i = 0; i < Rates.length; i++) {
			
			System.out.println("Nhập Rate " + i +": ");
			int rate = sc.nextInt(); 
			sum += rate;
		}
		return (float)sum/3;
		
	}
	
    public void insertNews() {
    	System.out.println("Nhập thông tin News:");
    	System.out.println("Nhập vào title: ");
    	String title = sc.nextLine();
    	System.out.println("Nhập vào publicDate: ");
    	String publicDate = sc.nextLine();
    	System.out.println("Nhập vào author: ");
    	String author = sc.nextLine();
    	System.out.println("Nhập vào content: ");
    	String content = sc.nextLine();
    	System.out.println("Nhập để lấy averangeRate: ");
    	float averangeRate = Calculate();
    	arrNews = new ArrayList<News>();
		News n = new News(title, publicDate, author, content, averangeRate);
		arrNews.add(n);   	
    }
    
    public void ViewList() {
    	insertNews();
    	System.out.println("Xem thông tin nhân viên");
		for (int i = 0; i < arrNews.size(); i++) {
			System.out.println(arrNews.get(i).getAverangeRate());
		}
    }
    
    
    
    
    public News() {};
    
	public News( String title, String publicDate, String author, String content, float averangeRate) {
		super();
		this.title = title;
		this.publicDate = publicDate;
		this.author = author;
		this.content = content;
		this.averangeRate = averangeRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverangeRate() {
		return averangeRate;
	}

	
}
