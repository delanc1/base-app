package com.crowe.archer.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CroweController {
    
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String getHelloWorld(HttpServletResponse response) {
        return "<div>Hello <b>World</b></div>";
    }
}
