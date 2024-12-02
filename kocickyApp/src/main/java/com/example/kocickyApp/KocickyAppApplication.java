package com.example.kocickyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@Controller
@SpringBootApplication
public class KocickyAppApplication {

	@GetMapping("/faktorial")
	public String faktorial(@RequestParam(required = false) Integer cislo, Model model){
		model.addAttribute("cislo", getFaktrorial(cislo));
		return "ff";
	}

	public static void main(String[] args) {
		SpringApplication.run(KocickyAppApplication.class, args);
	}

	public BigInteger getFaktrorial(int cislo){
		BigInteger x = BigInteger.ONE;

		for (int i = 1; i <= cislo; i++) {
		x = x.multiply(BigInteger.valueOf(i));
		}
		return x;
	}
}
