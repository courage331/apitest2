package com.example.apitest2.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumer {

	//
	@KafkaListener(topics = { "cafe24-product", "makeshop-product" })
	public void productTopic(ConsumerRecord<String, String> consumerRecord) {
		// log.info("andong start");
		int partition = consumerRecord.partition(); // consumer group내에서 할당된 번
		long topicOffset = consumerRecord.offset();
		String topicName = consumerRecord.topic(); // 토픽 이름
		String topicMessage = consumerRecord.value(); // 토픽 내용

		log.info("apitest2 {} {} {} {}", partition, topicOffset, topicName, topicMessage);
		// System.out.println(partition + " " + topicOffset + " " + topicName + " " + topicMessage);

		// offset
		/*
		 * Offset란? 파티션안에 데이터 위치를 유니크한 숫자로 표시한 것을 offset이라 부르고, 컨슈머는 자신이 어디까지 데이터를 가져갔는지 offset을 이용해서 관리를 합니다.
		 */

		// System.out.println("도착 성공 ");
	}
}
