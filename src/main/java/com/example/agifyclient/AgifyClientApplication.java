package com.example.agifyclient;

import com.example.agifyclient.entity.NameInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class AgifyClientApplication {

	private static final Logger log = LoggerFactory.getLogger(AgifyClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AgifyClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			String url = "https://api.agify.io/?name={name}";

			Map<String,String> uriParam = new HashMap<>();
			uriParam.put("name", "silvia");

			NameInfo nameInfo = restTemplate.getForObject(url, NameInfo.class, uriParam);

			log.info(nameInfo.toString());
		};
	}

}
