package com.example.apitest2.repository.my;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apitest2.vo.MProductInfo;

@Repository("makeShopProductRepository")
public interface MakeShopProductRepository extends JpaRepository<MProductInfo, String> {

}
