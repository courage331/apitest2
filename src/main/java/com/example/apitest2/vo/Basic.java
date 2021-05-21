package com.example.apitest2.vo;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basic {
	@Expose
	String sto_id;
	@Expose
	String opt_ids;
	@Expose
	String sto_type;
	@Expose
	String sto_opt_values;
	@Expose
	String sto_price;
	@Expose
	String sto_provide_price;
	@Expose
	String sto_real_stock;
	@Expose
	String sto_unlimit;
	@Expose
	String sto_stop_use;
	@Expose
	String sto_stop_stock;
	@Expose
	String sto_order_stock;
	@Expose
	String sto_state_code;
	@Expose
	String sto_option_code;
}
