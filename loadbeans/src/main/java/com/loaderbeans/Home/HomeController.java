package com.loaderbeans.Home;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        model.addAttribute("hoge", new Hoge());

        model.addAttribute("flag", true);
        return "home";
    }

    // fragments
    @GetMapping("/fragmentsample")
    public String fragment(){
        return "fragment/frag";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/mapExample")
    public String map(Model model) {

        HashMap<String, String> map = new HashMap<>();
        map.put("message", "mapthymeleaf");
        map.put("name","name");
        map.put("address","address");
        model.addAttribute("map", map);
        model.addAttribute("list", Arrays.asList(1, 2, 3, 4));

        model.addAttribute("paramValue", "Param value");
        return "mapExample";
    }

    public static class Hoge {
        public int publicField = 1;

        public int publicMethod() {
            return 2;
        }

        public int getPublicValue() {
            return 3;
        }

        // for object value direct in html view
        public String name = "thymeleaf object";
        public String value = "thymeleaf object value";
    }
}
