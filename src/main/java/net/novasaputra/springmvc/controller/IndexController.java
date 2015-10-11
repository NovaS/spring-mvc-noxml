package net.novasaputra.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.novasaputra.springmvc.service.HelloWorldService;

/**
 * @author novas
 */
@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired HelloWorldService helloService;
	
	@RequestMapping(method=RequestMethod.GET)
	private String getIndex(ModelMap model) {
		model.addAttribute("message", helloService.getHelloWorld());
		return "index";
	}
}
