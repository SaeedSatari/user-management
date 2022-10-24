package com.saeed.springbank.user.query.api;

import com.saeed.springbank.user.core.configuration.AxonConfig;
import com.saeed.springbank.user.core.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ AxonConfig.class, MongoConfig.class })
public class UserQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserQueryApplication.class, args);
	}

}
