package com.loaderbeans.ThymeleafLayoutDialect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {
    @GetMapping("/layout")
    public String layoutcall(){
        return "layout/content";
    }
    /**
     * first declare the template to the content.html
     * 
     * .as namespace
     *  declare xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
     * 
     * .layout:fragment to insert every page
     * <layout:fragment="content">
     * 
     * point to the location of template through layout:decorate
     * 
     * use frgment expression with ~{}
     * 
     */
}
