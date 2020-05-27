package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Abstraction.News;

public class ListNew {
	Scanner sc = new Scanner(System.in);
    ArrayList<News>listNew = new ArrayList<>();
    public void insertNews() {
    	System.out.println("Nhập vào số new cần thêm: ");
    	int n = sc.nextInt();
    	for (int i = 0; i < n; i++) {
    		News news = new News();
			System.out.println("Nhập thông tin new thứ: " + (i+1));
			System.out.println("Nhập vào Title: ");
			news.setTitle(sc.nextLine());
			System.out.println("Nhập vào PublishDate: ");
			news.setPublishDate(sc.nextLine());
			System.out.println("Nhập vào Author: ");
			news.setAuthor(sc.nextLine());
			System.out.println("Nhập vào Content: ");
			news.setContent(sc.nextLine());
			System.out.println("Nhập vào 3 đánh giá: ");
			float everageRate = news.calculate();
			listNew.add(news);
			
		}
    }
    
    public void viewNews() {
    	for (News news : listNew) {
			System.out.println("Thông tin new thứ: " + listNew.indexOf(news));
			news.display();
		}
    }
}
