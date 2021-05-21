package com.example.apitest2.vo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class mOption {

	String opt_id;
	String options_id;
	String opt_type;
	String opt_name;
	String opt_value;
	String opt_price;
	String opt_use;
	String opt_mix;
	String opt_mandatory;
	String opt_oneclick;
	ArrayList<String> opt_colors;
	ArrayList<String> opt_images;
	ArrayList<String> opt_detail_images;
	ArrayList<Option_data> option_data;
}
