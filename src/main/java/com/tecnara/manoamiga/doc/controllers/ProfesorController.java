package com.tecnara.manoamiga.doc.controllers;

import com.tecnara.manoamiga.aaa.controllers.TecnaraBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doc/profesor")
public class ProfesorController extends TecnaraBaseController{
    
    @GetMapping("/index")
    public String index(Model m){
        return "doc/profesor/index";
    }    
    
}
