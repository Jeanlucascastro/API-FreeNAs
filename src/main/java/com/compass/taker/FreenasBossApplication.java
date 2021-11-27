package com.compass.taker;


//import com.compass.taker.repository.JailsRepository;
//import com.compass.taker.services.JailsService;
import com.compass.taker.model.Jails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@SpringBootApplication
public class FreenasBossApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreenasBossApplication.class, args);
	}

	@Configuration
	class RunnerTestes implements CommandLineRunner {

		@Autowired
		private RestTemplate restTemplate;

		@Override
		public void run(String... args) throws Exception {
			System.out.println( "Executando CommandLineRunner..." );

			HttpHeaders headers = new HttpHeaders();
			headers.setBasicAuth("****", "****");
			headers.set("accept", "application/json");
			HttpEntity request = new HttpEntity(headers);

			ResponseEntity<List<Jailso>> response = restTemplate.exchange("http://10.128.40.253/api/v2.0/jail", HttpMethod.GET, request, new ParameterizedTypeReference<List<Jailso>>(){});

			List<Jailso> jailsos = response.getBody();

			jailsos.forEach(System.out::println);


			ResponseEntity<List<Jails>> response2 = restTemplate.exchange("http://10.128.40.253/api/v2.0/jail", HttpMethod.GET, request, new ParameterizedTypeReference<List<Jails>>(){});

			List<Jails> jails = response2.getBody();

			jails.forEach(System.out::println);



			System.out.println( "Fim de execução CommandLineRunner..." );

		l
		}
	}


	}




