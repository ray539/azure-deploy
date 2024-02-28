package com.example.azuredeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class AzureDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDeployApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return new String("deploy successul");
	}
	

}
