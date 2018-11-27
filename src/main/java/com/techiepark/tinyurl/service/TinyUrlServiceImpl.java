package com.techiepark.tinyurl.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.techiepark.tinyurl.dao.TinyUrlDaoImpl;
import com.techiepark.tinyurl.model.TinyUrl;

public class TinyUrlServiceImpl implements TinyUrlService {

	@Autowired
	TinyUrlDaoImpl tinyUrlDaoImpl;
	
	public void registerUrl(TinyUrl tinyUrl) {
		// TODO Auto-generated method stub
		tinyUrlDaoImpl.registerUrl(tinyUrl);
	}

}
