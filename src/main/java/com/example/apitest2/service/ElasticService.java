//package com.example.apitest2.service;
//
//import java.util.UUID;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.apitest2.repository.elasticsearch.Apitest2Repository;
//import com.example.apitest2.vo.ProductsFirst;
//import com.google.gson.Gson;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Service
//@Slf4j
//public class ElasticService {
//
//	@Autowired
//	@Resource(name = "apitest2Repository")
//	Apitest2Repository apitest2Repository;
//
//	ProductsFirst productfirst;
//
//	Gson gson = new Gson();
//
//	public void esave(String content) {
//
//		productfirst = gson.fromJson(content, ProductsFirst.class);
//
//		apitest2Repository.save(productfirst.builder().id(UUID.randomUUID().toString()).products(productfirst.getProducts()).build());
//
//		log.info("ElasticSearch success");
//	}
//
//}
