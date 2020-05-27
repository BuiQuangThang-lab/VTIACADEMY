package com.vti.frontend;

import com.vti.entity.Abstraction.News;

public class NewProgram {
public static void main(String[] args) {
	News news = new News();
	news.insert();
	news.display();
}
}
