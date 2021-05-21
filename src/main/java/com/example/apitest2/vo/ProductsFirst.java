package com.example.apitest2.vo;

import java.util.ArrayList;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
//@Document(indexName = "apitest2", type = "_doc")
public class ProductsFirst {
	@Id
	String id;

	ArrayList<Products> products;
}
