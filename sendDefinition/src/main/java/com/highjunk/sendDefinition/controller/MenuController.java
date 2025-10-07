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
	
	/**
	 * メニュー画面を表示する。
	 * @param model
	 * @return メニュー画面
	 */
	@RequestMapping("/menu")
	public String menu(Model model) {
		model.addAttribute("message", "メニュー画面");
		return "menu";
	}
	
	/**
	 * 入力画面を表示する。
	 * @param model
	 * @return 入力画面
	 */
	@RequestMapping("/input")
	public String input(Model model) {
		model.addAttribute("inputForm", new InputForm());
		return "input";
	}
	
	/**
	 * 出力画面を表示する。
	 * @param inputForm 入力フォーム
	 * @param model
	 * @return 出力画面
	 */
	@RequestMapping("/output")
	public String output(@ModelAttribute InputForm inputForm, Model model) {
		model.addAttribute("inputForm", inputForm);
		return "output";
	}

}
