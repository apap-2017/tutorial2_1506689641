package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/perkalian")
	public String hitungPerkalian (@RequestParam(value="a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b, Model model) {
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		int hasil = a * b; //kali nilai a dan b
		model.addAttribute("hasil", hasil);
		return "perkalian";
	}
}
