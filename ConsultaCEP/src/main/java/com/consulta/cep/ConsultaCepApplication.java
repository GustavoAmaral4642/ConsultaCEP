package com.consulta.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class ConsultaCepApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConsultaCepApplication.class, args);

	}

}
