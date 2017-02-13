package com.revature.book.test.model;

import com.revature.book.model.Book;

public class TestBook {
	public static void main(String[] args) {	
	Book book=new Book();
	book.setId(3);
	book.setName("power electronics");
	book.setContent("different types of power devices");
	System.out.println(book.getId());
	System.out.println(book.getName());
	System.out.println(book.getContent());
	}

}

