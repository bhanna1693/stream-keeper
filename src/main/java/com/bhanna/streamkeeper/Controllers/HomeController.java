package com.bhanna.streamkeeper.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String getLoginView() {
        return "login";
    }
}
