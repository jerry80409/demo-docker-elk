package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jerry on 2018/1/18.
 *
 * @author jerry
 */
@Controller
public class WebController {

    @Value("${spring.application.name}")
    String appName;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String landingPage() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value = "/charts", method = RequestMethod.GET)
    public String charts() {
        return "charts";
    }

    @RequestMapping(value = "/tables", method = RequestMethod.GET)
    public String tables() {
        return "tables";
    }

    @RequestMapping(value = "/cards", method = RequestMethod.GET)
    public String cards() {
        return "cards";
    }

    @RequestMapping(value = "/navbar", method = RequestMethod.GET)
    public String navbar() {
        return "navbar";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
    public String forgotPassword() {
        return "forgot-password";
    }

    @RequestMapping(value = "/blank", method = RequestMethod.GET)
    public String blank() {
        return "blank";
    }

}
