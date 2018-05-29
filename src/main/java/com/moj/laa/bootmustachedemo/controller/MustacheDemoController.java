package com.moj.laa.bootmustachedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MustacheDemoController extends TemplateController {

    public  MustacheDemoController(){
        super();
    }

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("params "+params());
        return new ModelAndView("index", params());
    }
}
