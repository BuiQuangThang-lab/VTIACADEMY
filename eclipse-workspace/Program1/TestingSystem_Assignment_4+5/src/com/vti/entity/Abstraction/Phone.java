package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.backend.Contact;

public class Phone {
	ArrayList<Contact>listContact = new ArrayList<Contact>();

	public void insertContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số contact muốn nhập: ");
		int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
			Contact c = new Contact();
			c.nhap();
			listContact.add(c);
		}
	}
	public void displayContact() {
		System.out.println("Thông tin contact: ");
		for (Contact contact : listContact) {
			System.out.println("thông tin contact thứ: " + listContact.indexOf(contact));
			contact.hien();
		}
	}
	
	public void updateContact(String name, String newPhone) {
		for (int i = 0; i < listContact.size(); i++) {
			if(listContact.get(i).getName().equals(name)) {
				listContact.get(i).setNumber(newPhone);
			}
		}
	}
}
