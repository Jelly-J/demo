package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Jelly on 2018/4/22.
 */
@Controller
public class WeComeController {

    @RequestMapping("/")
    public String welcome(HttpSession httpSession) {
        httpSession.setAttribute("aa","v_wbgdjing");
        return "index";
    }
}
