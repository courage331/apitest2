package com.example.apitest2.vo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Document(collection = "apitest2")
public class ErrorCode {
	String code;
	String regdate;
	String content;
}
