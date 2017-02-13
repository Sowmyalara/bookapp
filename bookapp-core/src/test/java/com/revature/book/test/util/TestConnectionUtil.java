
package com.revature.book.test.util;
import com.revature.book.util.ConnectionUtil;

public class TestConnectionUtil {
	public static void main(String[] args) {
		System.out.println(ConnectionUtil.dataSource());
		System.out.println(ConnectionUtil.getJdbcTemplate());
		
	}

}

