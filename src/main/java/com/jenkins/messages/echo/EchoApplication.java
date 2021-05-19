package com.jenkins.messages.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EchoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoApplication.class, args);
	}



	@GetMapping(value = "/echo/{input}")
	public String echoMessage(@PathVariable(name = "input") String input){
		return "Echoed back from server: "+input;
	}


}
