package com.barath.app;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaConfiguration {
	
	@Value("${kafka.topic.name}")
	private String topicName;
	
	
		@Bean
	    public KafkaAdmin admin(){
	        Map<String, Object> configs = new HashMap<>();
	        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG,
	                "localhost:9092");
	        return new KafkaAdmin(configs);
	    }

//	    @Bean
//	    public NewTopic testTopic(){
//	        return new NewTopic(topicName,3,(short)1);
//	    }

}
