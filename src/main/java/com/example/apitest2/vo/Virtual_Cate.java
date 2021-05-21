package com.example.apitest2.vo;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Virtual_Cate {
	@Expose
	String cate1;
	@Expose
	String cate2;
}
