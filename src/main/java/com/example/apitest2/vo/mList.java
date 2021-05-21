package com.example.apitest2.vo;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class mList {

	@Expose
	String uid;
	@Expose
	String brandcode;
	@Expose
	String cate1;
	@Expose
	String cate2;
	@Expose
	ArrayList<Virtual_Cate> virtual_cate;
	@Expose
	String category_name;
	@Expose
	String product_name;
	@Expose
	String consumerprice;
	@Expose
	String sellprice;
	@Expose
	String buyprice;
	@Expose
	String reserve;
	@Expose
	String mobile_reserve;
	@Expose
	String keyword;
	@Expose
	String sell_accept;
	@Expose
	String display;
	@Expose
	String product_type;
	@Expose
	String option_type;

//	@Expose
//	@SerializedName("options")
//	mOptions options;
	@Expose
	@SerializedName("options")
	ArrayList<mOptions> options;
	@Expose
	ArrayList<Stocks> stocks;
	@Expose
	String best_product_display;
	@Expose
	String best_review_display;
	@Expose
	String sellcount;
	@Expose
	String selldate;
	@Expose
	String regdate;
	@Expose
	String moddate;
	@Expose
	String quantity;
	@Expose
	String maximage;
	@Expose
	String minimage;
	@Expose
	String tinyimage;
	@Expose
	String provide_delivery_price;
	@Expose
	String supply_product_name;
	@Expose
	String supply_code;
	@Expose
	String supply_name;
	@Expose
	Icons icons;
	@Expose
	String sale_uid;
	@Expose
	String product_content;
	@Expose
	String display_date;
	@Expose
	Discount discount;
	@Expose
	String each_delivery;
	@Expose
	ArrayList<Discount_Except> discount_except;
	@Expose
	ArrayList<Color> color;
	@Expose
	Coupon_Except coupon_except;
	@Expose
	String view_count;
	@Expose
	@SerializedName("package")
	String packages;
	@Expose
	String is_add_composition;
	@Expose
	ArrayList<Add_composotion> add_composition;
	@Expose
	Regular_delivery regular_delivery;
}
