package com.revature.book.test.dao;

import com.revature.book.dao.BookDAO;
import com.revature.book.model.Book;

public class TestBookDAO {
	public static void main(String[] args) {	
		Book book=new Book();
		book.setId(3);
		book.setName("power electronics");
		book.setContent("different types of power devices");
		BookDAO bookdao=new BookDAO();
		bookdao.save(book);
		
		
	}

}
