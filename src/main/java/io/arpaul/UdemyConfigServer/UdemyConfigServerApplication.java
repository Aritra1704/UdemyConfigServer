package io.arpaul.UdemyConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UdemyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyConfigServerApplication.class, args);
	}

}
