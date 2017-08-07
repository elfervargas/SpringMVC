package com.spring.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.spring.pojo.PersonExtendedPOJO;
import com.spring.pojo.PersonPOJO;

@Controller
public class HelloController {
	private PersonPOJO person = new PersonPOJO();

	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		ArrayList<Object> list = new ArrayList<Object>();
		for(int i = 0; i<10; i++) {
			list.add(new PersonPOJO("Fernando",Long.parseLong(i+""), "Male"));
		}
		list.add(new PersonExtendedPOJO("Luis", 28L, "Male", "Kahuabomba"));
		String response = returnJSON(list);
		mav.addObject("response", response);
		return mav;
	}

	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		person.setName("Luis");
		person.setGender("Male");
		person.setYear(28L);
		mav.addObject("response", person);
		return mav;
	}
	
	public String returnJSON(Object list) {
		Gson gson = new GsonBuilder().create();
		Type type = new TypeToken<Object>() {}.getType();
		String response = gson.toJson(list, type);
		return response;
	}
}
