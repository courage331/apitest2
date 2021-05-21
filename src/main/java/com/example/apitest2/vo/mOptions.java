package com.example.apitest2.vo;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class mOptions {

//	String option_id;
//	String option_title;

	@Expose
	ArrayList<mOption> option;
	@Expose
	ArrayList<Basic> basic;
}
