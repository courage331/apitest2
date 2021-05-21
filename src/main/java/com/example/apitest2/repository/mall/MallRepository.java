package com.example.apitest2.repository.mall;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.apitest2.vo.MallAuthInfo;

@Repository("mallRepository")
public interface MallRepository extends JpaRepository<MallAuthInfo, String> {

	@Transactional // 메소드 내에서 Exception이 발생하면 해당 메소드에서 이루어진 db작업을 롤백한다.
	@Query(value = "select * from db_mall.tb_api_auth_info " + "where mall_id = :mall_id and service_no=5", nativeQuery = true) // :를 기준으로 parameter
																																// 표시
	MallAuthInfo findByMallID(@Param("mall_id") String mall_id);

}
