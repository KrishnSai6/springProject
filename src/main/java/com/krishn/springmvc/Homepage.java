package com.krishn.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Homepage {

    @GetMapping("/")
    public String home(){
        
        return "index.jsp";
    }

}
