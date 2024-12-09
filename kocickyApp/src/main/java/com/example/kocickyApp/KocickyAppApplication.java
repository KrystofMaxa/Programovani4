package com.example.kocickyApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@Controller
@SpringBootApplication
public class KocickyAppApplication {

	private StudentRepository srepo;


	@GetMapping("/faktorial")
	public String faktorial(@RequestParam(required = false) Integer cislo, Model model){
		model.addAttribute("cislo", getFaktrorial(cislo));
		return "ff";
	}

	@GetMapping("/student/new")
	public String pridejStudenta(@RequestParam String jmeno, @RequestParam(defaultValue = "15") Integer vek, Model model){
		Student student = new Student(jmeno,vek);
		srepo.save(student);

		return "ff";
	}
	@GetMapping("/student/all")
	public String vypisStudenty(Model model){
		System.out.println("Vypis pocet studentu: " + srepo.findAll().size());
		for (var s : srepo.findAll()){
			System.out.println(s);
		}
		return "ff";
	}

	public static void main(String[] args) {
		SpringApplication.run(KocickyAppApplication.class, args);
	}


	//inicicalizace tabulky database ?
	@Bean
	public CommandLineRunner inicializujStudenty(StudentRepository repo){

		srepo = repo;
		return (a) -> {
			repo.save(new Student("Karel", 69));
			repo.save(new Student("Rumburak", 96));
			System.out.println("VSICI STUDENTI: ");
			for (var s : repo.findAll()){
				System.out.println(s);
			}

		};
	}

	public BigInteger getFaktrorial(int cislo){
		BigInteger x = BigInteger.ONE;

		for (int i = 1; i <= cislo; i++) {
		x = x.multiply(BigInteger.valueOf(i));
		}
		return x;
	}
}
