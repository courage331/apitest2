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
public class Discount {
	@Expose
	String uid;
	@Expose
	String sale_type;
	@Expose
	String title;
	@Expose
	String user_type;
	@Expose
	String view_type;
	@Expose
	String view_icon;
	@Expose
	String view_m_icon;
	@Expose
	String device;
	@Expose
	String discount_price;
	@Expose
	String unit;
	@Expose
	String cut_optionString;
	@Expose
	String cut_position;
	@Expose
	String option_discount;
	@Expose
	String point;
	@Expose
	String period;
	@Expose
	String period_type;
	@Expose
	String product_coupon_except;
}
