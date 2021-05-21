package com.example.apitest2.vo;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Add_composotion {
	@Expose
	String sort;
	@Expose
	String uid;
	@Expose
	String product_name;
	@Expose
	String extra_require;
	@Expose
	String min_quantity;
}
