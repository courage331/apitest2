package com.example.apitest2.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stocks {

	String stock_id;
	String value;
	String price;
	String option_code;
}
