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
public class Products {

	@Expose
	String shop_no;

	@Expose
	String product_no;

	@Expose
	String product_code;

	@Expose
	String custom_product_code;
	@Expose
	String product_name;
	@Expose
	String eng_product_name;
	@Expose
	String supply_product_name;
	@Expose
	String internal_product_name;
	@Expose
	String model_name;
	@Expose
	String price_excluding_tax;
	@Expose
	String price;
	@Expose
	String retail_price;
	@Expose
	String supply_price;
	@Expose
	String display;
	@Expose
	String selling;
	@Expose
	String product_condition;
	@Expose
	String product_used_month;
	@Expose
	String summary_description;
	@Expose
	String product_tag;
	@Expose
	String margin_rate;
	@Expose
	String tax_type;
	@Expose
	String tax_amount;
	@Expose
	String price_content;
	@Expose
	String buy_limit_by_product;
	@Expose
	String buy_limit_type;
	@Expose
	String buy_group_list;
	@Expose
	String repurchase_restriction;
	@Expose
	String single_purchase_restriction;
	@Expose
	String buy_unit_type;
	@Expose
	String buy_unit;
	@Expose
	String order_quantity_limit_type;
	@Expose
	String minimum_quantity;
	@Expose
	String maximum_quantity;
	@Expose
	String points_by_product;
	@Expose
	String points_setting_by_payment;
	@Expose
	String points_amount;
	@Expose
	String except_member_points;

	@SerializedName("product_volume")
	@Expose
	Product_Volume product_volume;

	@Expose
	String adult_certification;
	@Expose
	String detail_image;
	@Expose
	String list_image;
	@Expose
	String tiny_image;
	@Expose
	String small_image;
	@Expose
	String use_naverpay;
	@Expose
	String naverpay_type;
	@Expose
	String manufacturer_code;
	@Expose
	String trend_code;
	@Expose
	String brand_code;
	@Expose
	String supplier_code;
	@Expose
	String made_date;
	@Expose
	String release_date;

	@SerializedName("expiration_date")
	@Expose
	Expiration_Data expiration_date;

	@Expose
	String origin_classification;
	@Expose
	String origin_place_no;
	@Expose
	String origin_place_value;
	@Expose
	String made_in_code;

	@SerializedName("icon_show_period")
	@Expose
	Icon_Show_Period icon_show_period;

	@SerializedName("icon")
	@Expose
	ArrayList<String> icon;

	@Expose
	String hscode;
	@Expose
	String product_weight;
	@Expose
	String product_material;
	@Expose
	String created_date;
	@Expose
	String updated_date;
	@Expose
	String english_product_material;
	@Expose
	String cloth_fabric;

	@SerializedName("list_icon")
	@Expose
	List_icon list_icon;

	@Expose
	String approve_status;
	@Expose
	String classification_code;
	@Expose
	String sold_out;
	@Expose
	String additional_price;
	@Expose
	String clearance_category_eng;
	@Expose
	String clearance_category_kor;
	@Expose
	String clearance_category_code;
	@Expose
	String exposure_limit_type;
	@Expose
	String exposure_group_list;
	@Expose
	String set_product_type;

}
