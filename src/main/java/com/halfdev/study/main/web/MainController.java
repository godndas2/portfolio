package com.halfdev.study.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HalfDev
 *
 */
@Controller
public class MainController {

	// 공통
	@RequestMapping("/main")
	public String mainPage() {
		return "home";
	}
}
