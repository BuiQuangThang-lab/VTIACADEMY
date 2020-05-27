package com.vti.entity.encapsulation;

public class Student4 {
	private int id;
	private String name;
	private String hometown;
	private double avgScore;
	
	


	

	public Student4(String name) {
		super();
		this.name = name;
	}

	public Student4(int id, String name, String hometown, double avgScore) {
		super();
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.avgScore = avgScore;
	}

	public void setAvgScore(double avgScore) {
		if(avgScore < 4.0) {
			System.out.println("Yếu");
		}
		else if(avgScore < 6.0) {
			System.out.println("Trung bình");
		}else if(avgScore < 8.0) {
			System.out.println("Khá");
		}else {
			System.out.println("Giỏi");
		}
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public double getAvgScore() {
		return avgScore;
	}

}
