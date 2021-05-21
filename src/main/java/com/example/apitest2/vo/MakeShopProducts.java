package com.example.apitest2.vo;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MakeShopProducts {

	String return_code;

	String totalCount;

	String totalPage;

	String count;

	@SerializedName("list")
	ArrayList<mList> list;

}
