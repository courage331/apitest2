package com.example.apitest2.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "cafe24_product") // 실제 db의 테이블과 매칭될 클래스임을 명시한다.
public class ProductInfo {

	@Column(name = "shop_no")
	@Expose
	String shop_no;

	@Id
	@Column(name = "product_no")
	@Expose
	String product_no;

	@Column(name = "product_code")
	@Expose
	String product_code;

	@Column(name = "custom_product_code")
	@Expose
	String custom_product_code;

	@Column(name = "product_name")
	String product_name;

	@Column(name = "eng_product_name")
	String eng_product_name;

	@Column(name = "supply_product_name")
	String supply_product_name;

	@Column(name = "internal_product_name")
	String internal_product_name;

	@Column(name = "model_name")
	String model_name;

	@Column(name = "price_excluding_tax")
	String price_excluding_tax;

	@Column(name = "price")
	String price;

	@Column(name = "retail_price")
	String retail_price;

	@Column(name = "supply_price")
	String supply_price;

	@Column(name = "display")
	String display;

	@Column(name = "selling")
	String selling;

	@Column(name = "product_condition")
	String product_condition;

	@Column(name = "product_used_month")
	String product_used_month;

	@Column(name = "summary_description")
	String summary_description;

	@Column(name = "product_tag")
	String product_tag;

	@Column(name = "margin_rate")
	String margin_rate;

	@Column(name = "tax_type")
	String tax_type;

	@Column(name = "tax_amount")
	String tax_amount;

	@Column(name = "price_content")
	String price_content;

	@Column(name = "buy_limit_by_product")
	String buy_limit_by_product;

	@Column(name = "buy_limit_type")
	String buy_limit_type;

	@Column(name = "buy_group_list")
	String buy_group_list;

	@Column(name = "repurchase_restriction")
	String repurchase_restriction;

	@Column(name = "single_purchase_restriction")
	String single_purchase_restriction;

	@Column(name = "buy_unit_type")
	String buy_unit_type;

	@Column(name = "buy_unit")
	String buy_unit;

	@Column(name = "order_quantity_limit_type")
	String order_quantity_limit_type;

	@Column(name = "minimum_quantity")
	String minimum_quantity;

	@Column(name = "maximum_quantity")
	String maximum_quantity;

	@Column(name = "points_by_product")
	String points_by_product;

	@Column(name = "points_setting_by_payment")
	String points_setting_by_payment;

	@Column(name = "points_amount")
	String points_amount;

	@Column(name = "except_member_points")
	String except_member_points;

	@Column(name = "product_volume")
	String product_volume;

	@Column(name = "adult_certification")
	String adult_certification;

	@Column(name = "detail_image")
	String detail_image;

	@Column(name = "list_image")
	String list_image;

	@Column(name = "tiny_image")
	String tiny_image;

	@Column(name = "small_image")
	String small_image;

	@Column(name = "use_naverpay")
	String use_naverpay;

	@Column(name = "naverpay_type")
	String naverpay_type;

	@Column(name = "manufacturer_code")
	String manufacturer_code;

	@Column(name = "trend_code")
	String trend_code;

	@Column(name = "brand_code")
	String brand_code;

	@Column(name = "supplier_code")
	String supplier_code;

	@Column(name = "made_date")
	String made_date;

	@Column(name = "release_date")
	String release_date;

	@Column(name = "expiration_date")
	String expiration_date;

	@Column(name = "origin_classification")
	String origin_classification;

	@Column(name = "origin_place_no")
	String origin_place_no;

	@Column(name = "origin_place_value")
	String origin_place_value;

	@Column(name = "made_in_code")
	String made_in_code;

	@Column(name = "icon_show_period")
	String icon_show_period;

	@Column(name = "icon")
	String icon;

	@Column(name = "hscode")
	String hscode;

	@Column(name = "product_weight")
	String product_weight;

	@Column(name = "product_material")
	String product_material;

	@Column(name = "created_date")
	String created_date;

	@Column(name = "updated_date")
	String updated_date;

	@Column(name = "english_product_material")
	String english_product_material;

	@Column(name = "cloth_fabric")
	String cloth_fabric;

	@Column(name = "list_icon")
	String list_icon;

	@Column(name = "approve_status")
	String approve_status;

	@Column(name = "classification_code")
	String classification_code;

	@Column(name = "sold_out")
	String sold_out;

	@Column(name = "additional_price")
	String additional_price;

	@Column(name = "clearance_category_eng")
	String clearance_category_eng;

	@Column(name = "clearance_category_kor")
	String clearance_category_kor;

	@Column(name = "clearance_category_code")
	String clearance_category_code;

	@Column(name = "exposure_limit_type")
	String exposure_limit_type;

	@Column(name = "exposure_group_list")
	String exposure_group_list;

	@Column(name = "set_product_type")
	String set_product_type;

}
