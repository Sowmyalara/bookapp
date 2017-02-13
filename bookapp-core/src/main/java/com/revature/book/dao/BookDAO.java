
package com.revature.book.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.book.model.Book;
import com.revature.book.util.ConnectionUtil;

public class BookDAO {
	private JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
	public void save(Book book){
			String sql="insert into book_details(NAME,CONTENT) values(?,?)";
			Object[] params={book.getId(),book.getName(),book.getContent()};
			int rows=jdbctemplate.update(sql,params);
			System.out.println("number of rows inserted"+rows);
	}

	
}

