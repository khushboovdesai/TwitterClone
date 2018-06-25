package com.koddi.twitter.clone.twitterCloneApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackages = "repository")
/*@Configuration
@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication
public class TwitterCloneAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterCloneAppApplication.class, args);
	}
}
