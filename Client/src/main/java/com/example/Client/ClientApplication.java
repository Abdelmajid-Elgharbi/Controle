package com.example.Client;

import com.example.Client.entities.Client;
import com.example.Client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner intializeH2Database(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "Amine Safi", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"), "jawad Ahmed", Float.parseFloat("22")));
			clientRepository.save(new Client(Long.parseLong("3"), "abdo abdo", Float.parseFloat("22")));


		};

	}
}