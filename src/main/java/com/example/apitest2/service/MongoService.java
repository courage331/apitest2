package com.example.apitest2.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.apitest2.vo.ErrorCode;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MongoService {

	@Resource
	MongoTemplate mongoTemplate;

	// mongodb 저장
	public void msave(String code, String content) {
		ErrorCode errcode = new ErrorCode();

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String regdate = formatter.format(date);

		errcode.setCode(code);
		errcode.setRegdate(regdate);
		errcode.setContent(content);
		mongoTemplate.insert(errcode);
		log.info("{}:{}:{}", code, regdate, content);
	}

}
