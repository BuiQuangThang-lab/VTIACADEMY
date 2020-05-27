package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.backend.ListNew;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float everageRate;
	private int[] Rates = new int[3];

	public int[] getRates() {
		return Rates;
	}

	public void setRates(int[] rates) {
		Rates = rates;
	}

	public News() {
	}

	public News(int id, String title, String publishDate, String author, String content, float everageRate) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.everageRate = everageRate;
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

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
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

	public float getEverageRate() {
		return everageRate;
	}

	Scanner scanner = new Scanner(System.in);
	ArrayList<News> listNew = new ArrayList<News>();

	public void insert() {
		News news = new News();
		System.out.println("Moi nhap so tin tuc muon them");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Moi ban nhap ID");
			setId(scanner.nextInt());
			System.out.println("Moi ban nhap Title");
			scanner.nextLine();
			setTitle(scanner.nextLine());
			System.out.println("Moi ban nhap ngay phat hanh");
			setPublishDate(scanner.next());
			System.out.println("Moi ban nhap ten tac gia");
			scanner.nextLine();
			setAuthor(scanner.nextLine());
			System.out.println("Moi ban nhap noi dung");
			setContent(scanner.nextLine());
			System.out.println("Moi ban nhap 3 danh gia");
			for (int j = 0; j < 3; j++) {
				int rate = scanner.nextInt();
				Rates[j] = rate;
			}
			setRates(Rates);
			listNew.add(news);
		}
	}

	public void display() {
		for (News news : listNew) {
            System.out.println("Thông tin new thứ: " + listNew.indexOf(news));
            System.out.println("ID: "+getId());		
    		System.out.println("Content: "+getContent());
    		System.out.println("Author: "+getAuthor());
    		System.out.println("Publish Date: "+getPublishDate());
    		System.out.println("Title: "+getTitle());
    		System.out.println("AverageRate: "+calculate());
		}

	}

	@Override
	public float calculate() {
		everageRate = (Rates[0] + Rates[1] + Rates[2]) / 3;
		return everageRate;
	}

}
