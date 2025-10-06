/**
 * 
 */
package com.highjunk.sendDefinition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.highjunk.sendDefinition.InputForm;

/**
 * 
 */
@Controller
public class MenuController {
	
	@RequestMapping("/menu")
	public String menu(Model model) {
		model.addAttribute("message", "メニュー画面");
		return "menu";
	}
	
	@RequestMapping("/input")
	public String input(Model model) {
		model.addAttribute("inputForm", new InputForm());
		return "input";
	}
	
	@RequestMapping("/output")
	public String output(@ModelAttribute InputForm inputForm, Model model) {
		model.addAttribute("inputForm", inputForm);
		return "output";
	}
	

}
