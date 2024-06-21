package com.dev.spring.http.controller;

import com.dev.spring.database.repository.CompanyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("hello")
    public ModelAndView hello(ModelAndView modelAndView, HttpServletRequest request, CompanyRepository companyRepository) {
        modelAndView.setViewName("greeting/hello");

        return modelAndView;
    }

    @GetMapping("bye")
    public ModelAndView bye() {
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting/bye");

        return modelAndView;
    }
}
