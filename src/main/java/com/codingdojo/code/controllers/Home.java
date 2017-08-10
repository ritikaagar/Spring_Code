package com.codingdojo.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Home {
	@RequestMapping("/")
	public String index(Model model, @ModelAttribute("errors") String errors) {
		model.addAttribute("errors");
		return "index.jsp";
	}
	
	@RequestMapping("/code")
		public String code(@RequestParam(value= "box", required = false) String box, RedirectAttributes redirectAttributes) {
		if (box.equals("bushido")) {
			return "result.jsp";
		}
			
		else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
}
