package com.example.apitest2.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "makeshop_product") // 실제 db의 테이블과 매칭될 클래스임을 명시한다.
public class MProductInfo {

	@Column(name = "uid")
	@Id
	String uid;

	@Column(name = "brandcode")
	String brandcode;

	@Column(name = "cate1")
	String cate1;

	@Column(name = "cate2")
	String cate2;

	@Column(name = "virtual_cate")
	String virtual_cate;

	@Column(name = "category_name")
	String category_name;

	@Column(name = "`product_name`")
	String product_name;

	@Column(name = "consumerprice")
	String consumerprice;

	@Column(name = "sellprice")
	String sellprice;

	@Column(name = "buyprice")
	String buyprice;

	@Column(name = "reserve")
	String reserve;

	@Column(name = "mobile_reserve")
	String mobile_reserve;

	@Column(name = "keyword")
	String keyword;

	@Column(name = "sell_accept")
	String sell_accept;

	@Column(name = "display")
	String display;

	@Column(name = "`product_type`")
	String product_type;

	@Column(name = "`option`")
	String option;

	@Column(name = "basic")
	String basic;

	@Column(name = "best_product_display")
	String best_product_display;

	@Column(name = "best_review_display")
	String best_review_display;

	@Column(name = "sellcount")
	String sellcount;

	@Column(name = "selldate")
	String selldate;

	@Column(name = "regdate")
	String regdate;

	@Column(name = "moddate")
	String moddate;

	@Column(name = "quantity")
	String quantity;

	@Column(name = "maximage")
	String maximage;

	@Column(name = "minimage")
	String minimage;

	@Column(name = "tinyimage")
	String tinyimage;

	@Column(name = "`provide_delivery_price`")
	String provide_delivery_price;

	@Column(name = "supply_product_name")
	String supply_product_name;

	@Column(name = "supply_code")
	String supply_code;

	@Column(name = "supply_name")
	String supply_name;

	@Column(name = "icons")
	String icons;

	@Column(name = "sale_uid")
	String sale_uid;

//	@Column(name = "`product_content`")
//	String product_content;

	@Column(name = "display_date")
	String display_date;

	@Column(name = "discount")
	String discount;

	@Column(name = "each_delivery")
	String each_delivery;

	@Column(name = "discount_except")
	String discount_except;

	@Column(name = "color")
	String color;

	@Column(name = "coupon_except")
	String coupon_except;

	@Column(name = "view_count")
	String view_count;

	@Column(name = "`packages`")
	String packages;

	@Column(name = "is_add_composition")
	String is_add_composition;

	@Column(name = "add_composition")
	String add_composition;

	@Column(name = "regular_delivery")
	String regular_delivery;
}
