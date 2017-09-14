package com.example.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public String hello () {
		return "hello";
	}
//	@RequestMapping("/greeting")
//	public String greeting (@RequestParam(value = "name") String name, Model model) {
//		model.addAttribute("name", name);
//		return "greeting";
//	}
	@RequestMapping(value = {"/greeting", "/greeting/{name}"})
	public String greetingPath(@PathVariable Optional<String> name, Model model) {
		if (name.isPresent()) {
			model.addAttribute("name", name.get());
		} else {
			model.addAttribute("name", "dengklek");
		}
		return "greeting";
	}
//	@RequestMapping("/greeting/{name}")
//	public String greetingPath (@PathVariable String name, Model model) {
//		model.addAttribute("name", name);
//		return "greeting";
//	}
//	
	//Latihan Perkalian
//	@RequestMapping
//	public String hitungPerkalian (@RequestParam(value="a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b, Model model) {
//		model.addAttribute("a", a);
//		model.addAttribute("b", b);
//		int hasil = a * b;
//		model.addAttribute("hasil", hasil);
//		return "perkalian";
//	}

}
