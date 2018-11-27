package com.techiepark.tinyurl.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techiepark.tinyurl.model.TinyUrl;

public class TinyUrlDaoImpl implements TinyUrlDao {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void registerUrl(TinyUrl tinyUrl) {
		// TODO Auto-generated method stub
		String sql = "insert into urlholder values(?,?)";
	}

}
