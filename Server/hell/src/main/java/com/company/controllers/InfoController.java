package com.company.controllers;
import com.company.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
public class InfoController {
    @Autowired
    private InfoService infoService;

    @PostMapping("/info")
    public String info()
    {
        return "info";
    }
}
