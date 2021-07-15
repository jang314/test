package com.tscms.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexRestController {
	@RequestMapping(value="index", method=RequestMethod.GET)
	public ModelAndView index (ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
}
