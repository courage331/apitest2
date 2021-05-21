package com.example.apitest2.service;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.apitest2.repository.mall.MallRepository;
import com.example.apitest2.repository.my.Cafe24ProductRepository;
import com.example.apitest2.repository.my.MakeShopProductRepository;
import com.example.apitest2.vo.MProductInfo;
import com.example.apitest2.vo.MakeShopProducts;
import com.example.apitest2.vo.MallAuthInfo;
import com.example.apitest2.vo.ProductInfo;
import com.example.apitest2.vo.Products;
import com.example.apitest2.vo.ProductsFirst;
import com.example.apitest2.vo.mList;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Test2Service {

	@Autowired
	private Gson gson;

	RestTemplate restTemplate = new RestTemplate();

	ProductsFirst productfirst = new ProductsFirst();

	MakeShopProducts makeShopProducts;

	@Autowired
	// @Resource(name = "mallRepository")
	MallRepository mallRepository;

	@Autowired
	Cafe24ProductRepository cafe24ProductRepository;

	@Autowired
	MakeShopProductRepository makeShopProductRepository;

	@Autowired
	MongoService mongoservice;

	@Autowired
	KafkaProducerService kafkaProducerService;

//	@Autowired
//	ElasticService elasticservice;

	// @Autowired
	@Resource(name = "apitest2")
	RedisTemplate<String, String> redisTemplate;

	// mall_id로 service_no 찾기
	public MallAuthInfo authsearch(String mall_id) {

		return mallRepository.findByMallID(mall_id);
	}

	// cafe24 상품찾기
	public String productsearch(Map<String, Object> reqPara) {
		try {
			String mall_id = (String) reqPara.get("mall_id");
			String hosting_mall_id = (String) reqPara.get("hosting_mall_id");
			String access_token = (String) reqPara.get("access_token");
			String start_date = (String) reqPara.get("start_date");
			String end_date = (String) reqPara.get("end_date");

			restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
			String url = "https://" + hosting_mall_id + ".cafe24api.com/api/v2/admin/products?created_start_date=" + start_date + "&created_end_date="
					+ end_date;

			HttpHeaders headers = new HttpHeaders();
			String token = "Bearer " + access_token;

			headers.add("Authorization", token);

//			log.info(url);

			log.info("{}", url);

			final HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

			productfirst = gson.fromJson(response.getBody(), ProductsFirst.class);

			List<ProductInfo> productInfoList = new ArrayList<>();
			for (Products product : productfirst.getProducts()) {
				ProductInfo temp = new ProductInfo();

				temp.setProduct_no(product.getProduct_no());
				temp.setShop_no(product.getShop_no());
				temp.setProduct_code(product.getProduct_code());
				temp.setCustom_product_code(product.getCustom_product_code());
				temp.setProduct_name(product.getProduct_name());
				temp.setEng_product_name(product.getEng_product_name());
				temp.setSupply_product_name(product.getSupply_product_name());
				// temp.setInternal_product_name(json.get("internal_product_name") == null ? null : json.get("internal_product_name").getAsString());
				temp.setInternal_product_name(product.getInternal_product_name());
				temp.setModel_name(product.getModel_name());
				temp.setPrice_excluding_tax(product.getPrice_excluding_tax());
				temp.setPrice(product.getPrice());
				temp.setRetail_price(product.getRetail_price());
				temp.setSupply_price(product.getSupply_price());
				temp.setDisplay(product.getDisplay());
				temp.setSelling(product.getSelling());
				temp.setProduct_condition(product.getProduct_condition());
				temp.setProduct_used_month(product.getProduct_used_month());
				temp.setSummary_description(product.getSummary_description());
				temp.setProduct_tag(product.getProduct_tag());
				temp.setMargin_rate(product.getMargin_rate());
				temp.setTax_type(product.getTax_type());
				temp.setTax_amount(product.getTax_amount());
				temp.setPrice_content(product.getPrice_content());
				temp.setBuy_limit_by_product(product.getBuy_limit_by_product());
				temp.setBuy_limit_type(product.getBuy_limit_type());
				temp.setBuy_group_list(product.getBuy_group_list());
				temp.setRepurchase_restriction(product.getRepurchase_restriction());
				temp.setSingle_purchase_restriction(product.getSingle_purchase_restriction());
				temp.setBuy_unit_type(product.getBuy_unit_type());
				temp.setBuy_unit(product.getBuy_unit());
				temp.setOrder_quantity_limit_type(product.getOrder_quantity_limit_type());
				temp.setMinimum_quantity(product.getMinimum_quantity());
				temp.setMaximum_quantity(product.getMaximum_quantity());
				temp.setPoints_by_product(product.getPoints_by_product());
				temp.setPoints_setting_by_payment(product.getPoints_setting_by_payment());
				temp.setPoints_amount(product.getPoints_amount());
				temp.setExcept_member_points(product.getExcept_member_points());
				if (product.getProduct_volume() != null) {
					temp.setProduct_volume(product.getProduct_volume().toString());
				}
				temp.setAdult_certification(product.getAdult_certification());
				temp.setDetail_image(product.getDetail_image());
				temp.setList_image(product.getList_image());
				temp.setTiny_image(product.getTiny_image());
				temp.setSmall_image(product.getSmall_image());
				temp.setUse_naverpay(product.getUse_naverpay());
				temp.setNaverpay_type(product.getNaverpay_type());
				temp.setManufacturer_code(product.getManufacturer_code());
				temp.setTrend_code(product.getTrend_code());
				temp.setBrand_code(product.getBrand_code());
				temp.setSupplier_code(product.getSupplier_code());
				temp.setMade_date(product.getMade_date());
				temp.setRelease_date(product.getRelease_date());
				if (product.getExpiration_date() != null) {
					temp.setExpiration_date(product.getExpiration_date().toString());
				}
				temp.setOrigin_classification(product.getOrigin_classification());
				temp.setOrigin_place_no(product.getOrigin_place_no());
				temp.setOrigin_place_value(product.getOrigin_place_value());
				temp.setMade_in_code(product.getMade_in_code());
				if (product.getIcon_show_period() != null) {
					temp.setIcon_show_period(product.getIcon_show_period().toString());
				}
				if (product.getIcon() != null) {
					temp.setIcon(product.getIcon().toString());
				}
				temp.setHscode(product.getHscode());
				temp.setProduct_weight(product.getProduct_weight());
				temp.setCreated_date(product.getCreated_date());
				temp.setUpdated_date(product.getUpdated_date());
				temp.setEnglish_product_material(product.getEnglish_product_material());
				temp.setCloth_fabric(product.getCloth_fabric());
				if (product.getList_icon() != null) {
					temp.setList_icon(product.getList_icon().toString());
				}
				temp.setApprove_status(product.getApprove_status());
				temp.setClassification_code(product.getClassification_code());
				temp.setProduct_material(product.getProduct_material());
				temp.setSold_out(product.getSold_out());
				temp.setAdditional_price(product.getAdditional_price());
				temp.setClearance_category_eng(product.getClearance_category_eng());
				temp.setClearance_category_kor(product.getClearance_category_kor());
				temp.setClearance_category_code(product.getClearance_category_code());
				temp.setExposure_limit_type(product.getExposure_limit_type());
				temp.setExposure_group_list(product.getExposure_group_list());
				temp.setSet_product_type(product.getSet_product_type());

				productInfoList.add(temp);

			}
//			elasticservice.esave(response.getBody());
			cafe24ProductRepository.saveAll(productInfoList);
			redisTemplate.opsForValue().set(mall_id, response.getBody(), 10, TimeUnit.MINUTES);
			kafkaProducerService.sendTopic("cafe24-product", response.getBody());
			return response.getBody();
		} catch (Exception e) {
			mongoservice.msave("cafe24 db error", e.getMessage());
			return "cafe24 db error";
		}
	}

	// 메이크
	public String productsearch2(Map<String, Object> reqPara) {
		try {
			String mall_id = (String) reqPara.get("mall_id");
			String start_date = (String) reqPara.get("start_date");
			String hosting_url_addr = (String) reqPara.get("hosting_url_addr");
			String licensekey = (String) reqPara.get("licensekey");
			String shopkey = (String) reqPara.get("shopkey");

			restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
			String n_start_date = start_date + " " + "00:00:00";

			Date date = new Date();
			date.setYear(Integer.parseInt(start_date.split("-")[0]) - 1900);
			date.setMonth(Integer.parseInt(start_date.split("-")[1]));
			date.setDate(Integer.parseInt(start_date.split("-")[2]));

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, -1);
			cal.add(Calendar.DATE, +29);

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String n_end_date = formatter.format(cal.getTime()) + " " + "23:59:59";

			String url = hosting_url_addr + "/list/open_api.html?mode=search&InquiryType=reg&InquiryTimeFrom=" + n_start_date + "&InquiryTimeTo="
					+ n_end_date + "&type=product";
			HttpHeaders headers = new HttpHeaders();

			headers.add("licensekey", licensekey);
			headers.add("shopkey", shopkey);

			log.info(url);

			final HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

			makeShopProducts = gson.fromJson(response.getBody(), MakeShopProducts.class);

			List<MProductInfo> productInfoList = new ArrayList<>();
			for (mList mspl : makeShopProducts.getList()) {
				MProductInfo temp = new MProductInfo();
				temp.setUid(mspl.getUid());
				temp.setBrandcode(mspl.getBrandcode());
				temp.setCate1(mspl.getCate1());
				temp.setCate2(mspl.getCate2());
				if (mspl.getVirtual_cate() != null) {
					temp.setVirtual_cate(mspl.getVirtual_cate().toString());
				}
				temp.setCategory_name(mspl.getCategory_name());
				temp.setProduct_name(mspl.getProduct_name());
				temp.setConsumerprice(mspl.getConsumerprice());
				temp.setBuyprice(mspl.getBuyprice());
				temp.setSellprice(mspl.getSellprice());
				temp.setReserve(mspl.getReserve());
				temp.setMobile_reserve(mspl.getMobile_reserve());
				temp.setKeyword(mspl.getKeyword());
				temp.setSell_accept(mspl.getSell_accept());
				temp.setDisplay(mspl.getDisplay());
				temp.setProduct_type(mspl.getProduct_type());
				if (mspl.getOptions().toString() != null) {
					temp.setOption(mspl.getOptions().toString());
				}
//				if (mspl.getStocks().toString() != null) {
//					temp.setBasic(mspl.getStocks().toString());
//				}
				temp.setBest_product_display(mspl.getBest_product_display());
				temp.setBest_review_display(mspl.getBest_review_display());
				temp.setSelldate(mspl.getSelldate());
				temp.setRegdate(mspl.getRegdate());
				temp.setModdate(mspl.getModdate());
				temp.setQuantity(mspl.getQuantity());
				temp.setMaximage(mspl.getMaximage());
				temp.setMinimage(mspl.getMinimage());
				temp.setTinyimage(mspl.getTinyimage());
				temp.setProvide_delivery_price(mspl.getProvide_delivery_price());
				temp.setSupply_product_name(mspl.getSupply_name());
				temp.setSupply_code(mspl.getSupply_code());
				temp.setSupply_name(mspl.getSupply_name());
				if (mspl.getIcons() != null) {
					temp.setIcons(mspl.getIcons().toString());
				}
				temp.setSale_uid(mspl.getSale_uid());
				// temp.setProduct_content(mspl.getProduct_content());
				temp.setDisplay_date(mspl.getDisplay_date());
				if (mspl.getDiscount() != null) {
					temp.setDiscount(mspl.getDiscount().toString());
				}
				temp.setEach_delivery(mspl.getEach_delivery());
				if (mspl.getDiscount_except() != null) {
					temp.setDiscount_except(mspl.getDiscount_except().toString());
				}
				if (mspl.getColor() != null) {
					temp.setColor(mspl.getColor().toString());
				}
				if (mspl.getCoupon_except() != null) {
					temp.setCoupon_except(mspl.getCoupon_except().toString());
				}
				temp.setView_count(mspl.getView_count());
				temp.setPackages(mspl.getPackages());
				temp.setIs_add_composition(mspl.getIs_add_composition());
				if (mspl.getAdd_composition() != null) {
					temp.setAdd_composition(mspl.getAdd_composition().toString());
				}
				if (mspl.getRegular_delivery() != null) {
					temp.setRegular_delivery(mspl.getRegular_delivery().toString());
				}

				productInfoList.add(temp);
			}
			makeShopProductRepository.saveAll(productInfoList);
			redisTemplate.opsForValue().set(mall_id, response.getBody(), 10, TimeUnit.MINUTES);
			kafkaProducerService.sendTopic("makeshop-product", response.getBody());
			return response.getBody();
		} catch (Exception e) {
			mongoservice.msave("makeshop db error", e.getMessage());
			return "makeshop db error";
		}

	}

}
