package com.loaderbeans.ThymeleafLayoutDialect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {
    @GetMapping("/layout")
    public String layoutcall(){
        return "layout/content";
    }
}
