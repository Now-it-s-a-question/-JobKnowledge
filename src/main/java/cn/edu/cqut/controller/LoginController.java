package cn.edu.cqut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/index")
    private String getIndex() {
        return "/index";
    }
}
