package com.example.apitest2.repository.my;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apitest2.vo.ProductInfo;

@Repository("cafe24ProductRepository")
public interface Cafe24ProductRepository extends JpaRepository<ProductInfo, String> {

}
