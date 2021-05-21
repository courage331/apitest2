package com.example.apitest2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.apitest2.service.MongoService;
import com.example.apitest2.service.Test2Service;
import com.example.apitest2.vo.MallAuthInfo;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/product")
@Slf4j
public class Test2Controller {

	@Autowired
	private Gson gson;

	@Autowired
	Test2Service test2service;

	@Autowired
	MongoService mongoservice;

	// 카페24
	@RequestMapping(method = RequestMethod.GET, value = "/{mall_id}/{start_date}/{end_date}")
	public String cafe24ProductSearch(@PathVariable("mall_id") String mall_id, @PathVariable("start_date") String start_date,
			@PathVariable("end_date") String end_date) {

		try {
			MallAuthInfo mai = test2service.authsearch(mall_id);

			String hosting_mall_id = mai.getHosting_mall_id();
			String access_token = mai.getAccess_token();
			Map<String, Object> reqPara = new HashMap<String, Object>();
			reqPara.put("mall_id", mall_id);
			reqPara.put("hosting_mall_id", hosting_mall_id);
			reqPara.put("access_token", access_token);
			reqPara.put("start_date", start_date);
			reqPara.put("end_date", end_date);

			return test2service.productsearch(reqPara);
		} catch (Exception e) {

			mongoservice.msave("mall_id error", e.getMessage());
			return "해당 업체가 없습니다...";
		}

	}

	// 메이크샵
	@RequestMapping(method = RequestMethod.GET, value = "/{mall_id}/{start_date}")
	public String MakeShopProductSearch(@PathVariable("mall_id") String mall_id, @PathVariable("start_date") String start_date) {

		try {
			MallAuthInfo mai = test2service.authsearch(mall_id);

			String hosting_url_addr = mai.getHosting_url_addr();
			String licensekey = mai.getLicense_key();
			String shopkey = mai.getApi_key();
			Map<String, Object> reqPara = new HashMap<String, Object>();
			reqPara.put("mall_id", mall_id);
			reqPara.put("hosting_url_addr", hosting_url_addr);
			reqPara.put("licensekey", licensekey);
			reqPara.put("shopkey", shopkey);
			reqPara.put("start_date", start_date);

			return test2service.productsearch2(reqPara);
		} catch (Exception e) {

			mongoservice.msave("mall_id error", e.getMessage());
			return "해당 업체가 없습니다...";
		}

	}

}
