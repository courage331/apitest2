package com.example.apitest2.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Discount_Except {

	String group_id;
	String group;
	String period;
	String wholesale;
}
